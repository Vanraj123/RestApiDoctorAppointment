package com.HealthCare.AppointmentSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HealthCare.AppointmentSystem.DAO.DoctorDAO;
import com.HealthCare.AppointmentSystem.Entity.Doctor;

@Service
public class DoctorService {
	@Autowired
    private DoctorDAO doctorRepository;

    public List<Doctor> getAllDoctors() {
        return doctorRepository.getAllDoctors();
    }

    public Doctor getDoctorById(int id) {
        return doctorRepository.getDoctorById(id).getDoctor();
    }

    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.createDoctor(doctor);
    }

    public void deleteDoctor(int id) {
    	doctorRepository.deleteDoctor(id);
    }
    public Doctor updateDoctor(Doctor doctor) {
        return doctorRepository.updateDoctor(doctor);
    }
}
