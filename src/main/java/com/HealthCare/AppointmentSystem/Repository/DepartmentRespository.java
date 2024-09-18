package com.HealthCare.AppointmentSystem.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.HealthCare.AppointmentSystem.Entity.Department;

public interface DepartmentRespository extends JpaRepository<Department, Long>{

}
