package com.HealthCare.AppointmentSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HealthCare.AppointmentSystem.DAO.PatientDAO;
import com.HealthCare.AppointmentSystem.Entity.Patient;

@Service
public class PatientService {
	@Autowired
    private PatientDAO PatientRepository;

    public List<Patient> getAllPatients() {
        return PatientRepository.getAllPatients();
    }

    public Patient getPatientById(int id) {
        return PatientRepository.getPatientById(id).getPatient();
    }

    public Patient createPatient(Patient doctor) {
        return PatientRepository.createPatient(doctor);
    }

    public void deletePatient(int id) {
    	PatientRepository.deletePatient(id);
    }
    
    public Patient updatePatient(Patient patient) {
        return PatientRepository.updatePatient(patient);
    }
    
}
