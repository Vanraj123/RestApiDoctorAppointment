package com.HealthCare.AppointmentSystem.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.HealthCare.AppointmentSystem.Entity.Doctor;
public interface DoctorRepository extends JpaRepository<Doctor , Long>{

}
