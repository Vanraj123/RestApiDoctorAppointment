package com.HealthCare.AppointmentSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HealthCare.AppointmentSystem.Entity.Department;
import com.HealthCare.AppointmentSystem.Service.DepartmentService;

@RestController
@RequestMapping("/Department")
public class Departmentcontroller {
	@Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllAppointments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getAppointmentById(@PathVariable int id) {
        return departmentService.getDepartmentById(id).getDepartment();
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department appointment) {
        return departmentService.createDepartment(appointment);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable int id) {
    	departmentService.deleteDepartment(id);
    }
    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable int id, @RequestBody Department department) {
        department.setId(id);
        department.setName(department.getName());
        return departmentService.updateDepartment(department);
    }
}
