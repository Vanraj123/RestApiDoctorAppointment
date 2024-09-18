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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@JsonIgnoreType
@Table(name = "patient")
public class Patient {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="name")
	String name;
	@Column(name="address")
	String address;
	@Column(name="mobile_no")
	String mobile_no;
	@Column(name="blood_group")
	String blood_group;
//	@Column(name="appointments")
//	@OneToMany(mappedBy = "patient_id" ,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    private List<Appointment> appointments;
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Patient(int id, String name, String address, String mobile_no, String blood_group) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile_no = mobile_no;
		this.blood_group = blood_group;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

//	public Patient(List<Appointment> appointments) {
//		super();
//		this.appointments = appointments;
//	}

	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", address=" + address + ", mobile_no=" + mobile_no
				+ ", blood_group=" + blood_group +  "]";
	}

	public Patient getPatient() {
        return this;
    }
}
