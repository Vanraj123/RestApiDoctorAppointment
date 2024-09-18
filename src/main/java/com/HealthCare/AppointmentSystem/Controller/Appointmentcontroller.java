package com.HealthCare.AppointmentSystem.Controller;

import java.util.*;

import com.HealthCare.AppointmentSystem.Entity.Appointment;
import com.HealthCare.AppointmentSystem.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Appointment")
public class Appointmentcontroller {

	 	@Autowired
	    private AppointmentService appointmentService;

	    @GetMapping
	    public List<Appointment> getAllAppointments() {
	        return appointmentService.getAllAppointments();
	    }

	    @GetMapping("/{id}")
	    public Appointment getAppointmentById(@PathVariable int id) {
	        return appointmentService.getAppointmentById(id).getAppointment();
	    }

	    @PostMapping
	    public Appointment createAppointment(@RequestBody Appointment appointment) {
	        return appointmentService.createAppointment(appointment);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteAppointment(@PathVariable int id) {
	        appointmentService.deleteAppointment(id);
	    }
	    @PutMapping("/{id}")
	    public Appointment updateAppointment(@PathVariable int id, @RequestBody Appointment appointment) {
	        appointment.setId(id); 
	        appointment.setType(appointment.getType());
	        appointment.setWard(appointment.getWard());
	        appointment.setDepartment(appointment.getDepartment());
	        appointment.setDoctor_id(appointment.getDoctor_id());
	        appointment.setPatient_id(appointment.getPatient_id());
	        
	        
	        return appointmentService.updateAppointment(appointment);
	    }
}
