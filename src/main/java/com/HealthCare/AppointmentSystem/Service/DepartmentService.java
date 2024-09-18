package com.HealthCare.AppointmentSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HealthCare.AppointmentSystem.DAO.DepartmentDAO;
import com.HealthCare.AppointmentSystem.Entity.Department;

@Service
public class DepartmentService {
	@Autowired
	 private DepartmentDAO departmentRepository;
	
	public List<Department> getAllDepartments()
	{
        return departmentRepository.getAllDepartments();
	}
	public Department getDepartmentById(int theId){
        return departmentRepository.getDepartmentById(theId).getDepartment();
    }
	
	public Department createDepartment(Department theDepartment){
        return departmentRepository.createDepartment(theDepartment);
    }
	
	public void deleteDepartment(int theId) {
	departmentRepository.deleteDepartment(theId);
	}
	public Department updateDepartment(Department department) {
        return departmentRepository.updateDepartment(department);
    }
}
