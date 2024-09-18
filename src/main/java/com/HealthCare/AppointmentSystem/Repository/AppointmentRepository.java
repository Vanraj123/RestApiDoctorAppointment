package com.HealthCare.AppointmentSystem.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.HealthCare.AppointmentSystem.Entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

}
