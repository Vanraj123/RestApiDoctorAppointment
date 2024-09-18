package com.HealthCare.AppointmentSystem.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@JsonIgnoreType
@Table(name = "doctor")
public class Doctor {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="name")
	String name;
	@Column(name="mobile_no")
	String mobile_no;
	@Column(name="type")
	String type;
	@JoinColumn(name = "department_id")
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Department department;
	
	@OneToMany(mappedBy = "doctor_id",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Appointment> appointments;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	public Doctor(int id, String name, String mobile_no, String type, Department department,
			List<Appointment> appointments) {
		super();
		this.id = id;
		this.name = name;
		this.mobile_no = mobile_no;
		this.type = type;
		this.department = department;
		this.appointments = appointments;
	}





	public List<Appointment> getAppointments() {
		return appointments;
	}


	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Doctor getDoctor() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", mobile_no=" + mobile_no + ", type=" + type + ", department="
				+ department + ", appointments=" + appointments + "]";
	}


	public int getDepartment_id() {
        if (this.department != null) {
            return this.department.getId();
        } else {
            return 0;
        }
    }
	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	
	
}
