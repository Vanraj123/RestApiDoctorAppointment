package com.HealthCare.AppointmentSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HealthCare.AppointmentSystem.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient , Long>{

}
