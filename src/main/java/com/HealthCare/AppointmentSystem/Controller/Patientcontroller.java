package com.HealthCare.AppointmentSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HealthCare.AppointmentSystem.Entity.Patient;
import com.HealthCare.AppointmentSystem.Service.PatientService;

@RestController
@RequestMapping("/Patient")
public class Patientcontroller {
	@Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllAppointments() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getAppointmentById(@PathVariable int id) {
        return  (patientService.getPatientById(id)).getPatient();
    }

    @PostMapping
    public Patient createAppointment(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable int id) {
    	patientService.deletePatient(id);
    }
    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable int id, @RequestBody Patient patientDetails) {
        Patient existingPatient = patientService.getPatientById(id);
        
        if (existingPatient != null) {
            // Update patient details
            existingPatient.setName(patientDetails.getName());
            existingPatient.setAddress(patientDetails.getAddress());
            existingPatient.setMobile_no(patientDetails.getMobile_no());
            existingPatient.setBlood_group(patientDetails.getBlood_group());

            return patientService.updatePatient(existingPatient);
        } else {
            throw new ResourceNotFoundException("Patient not found with id: " + id);
        }
    }

}
