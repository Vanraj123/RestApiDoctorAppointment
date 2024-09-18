package com.HealthCare.AppointmentSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HealthCare.AppointmentSystem.Entity.Department;
import com.HealthCare.AppointmentSystem.Entity.Doctor;
import com.HealthCare.AppointmentSystem.Service.DepartmentService;
import com.HealthCare.AppointmentSystem.Service.DoctorService;

@RestController
@RequestMapping("/Doctor")
public class Doctorcontroller {
	@Autowired
    private DoctorService doctorService;
	private DepartmentService departmentService;
	
	 public Doctorcontroller(DoctorService doctorService, DepartmentService departmentService) {
	        this.doctorService = doctorService;
	        this.departmentService = departmentService;
	    }
    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable int id) {
        return doctorService.getDoctorById(id).getDoctor();
    }

    @PostMapping
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctorRequest) {
        // Check if the department exists
    	Department department = null;
//        if (doctorRequest.getDepartment_id() == 0) {
//            // Handle the case where department_id is 0 (no associated department)
//            // You may choose to throw an exception, return an error response, or handle it in your business logic
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
//        }
//        
        // Check if the department exists
//        Department department = departmentService.getDepartmentById(doctorRequest.getDepartment_id());
//        if (department == null) {
//            // Handle the case where the department does not exist
//            // You may choose to throw an exception, return an error response, or handle it in your business logic
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
//        }

        // Create doctor
        Doctor doctor = new Doctor();
        doctor.setName(doctorRequest.getName());
        doctor.setMobile_no(doctorRequest.getMobile_no());
        doctor.setType(doctorRequest.getType());
        doctor.setDepartment(department); // Set the department for the doctor

        Doctor createdDoctor = doctorService.createDoctor(doctor);
        return ResponseEntity.ok(createdDoctor);
    }


    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable int id) {
    	doctorService.deleteDoctor(id);
    }
    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable int id, @RequestBody Doctor doctor) {
        doctor.setId(id); 
        doctor.setMobile_no(doctor.getMobile_no());
        doctor.setName(doctor.getName());
        doctor.setType(doctor.getType());
        return doctorService.updateDoctor(doctor);
    }
}
