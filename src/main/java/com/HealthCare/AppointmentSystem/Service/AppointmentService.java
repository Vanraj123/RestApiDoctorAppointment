package com.HealthCare.AppointmentSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.HealthCare.AppointmentSystem.Entity.Appointment;
import com.HealthCare.AppointmentSystem.DAO.*;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
	@Autowired
    private AppointmentDAO appointmentRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.getAllAppointments();
    }

    public Appointment getAppointmentById(int id) {
        return appointmentRepository.getAppointmentById(id).getAppointment();
    }

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.createAppointment(appointment);
    }

    public void deleteAppointment(int id) {
        appointmentRepository.deleteAppointment(id);
    }
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.updateAppointment(appointment);
    }
}
