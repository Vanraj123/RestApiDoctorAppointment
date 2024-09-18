	package com.HealthCare.AppointmentSystem.Entity;
	
	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	import com.fasterxml.jackson.annotation.JsonIgnoreType;
	import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.ManyToOne;
	import jakarta.persistence.Entity;
	import jakarta.persistence.FetchType;
	@Entity
	@JsonIgnoreType
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonIgnoreProperties(ignoreUnknown = true)
	public class Appointment {
		@Id
		@Column(name="id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		@Column(name="type")
		String type;
		@Column(name="ward")
		String ward;
		@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	    @JoinColumn(name = "patient_id")
	    private Patient patient_id;
	
	    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	    @JoinColumn(name = "doctor_id")
	    private Doctor doctor_id;
	
	    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	    @JoinColumn(name = "department")
	    private Department department;
		
		public Appointment() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Appointment(int id, String type, String ward,Patient  patient_id, Doctor doctor_id,Department department) {
			super();
			this.id = id;
			this.type = type;
			this.ward = ward;
			this.patient_id = patient_id;
			this.doctor_id = doctor_id;
			this.department = department;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getWard() {
			return ward;
		}
		public void setWard(String ward) {
			this.ward = ward;
		}
		
		public Appointment(Department department) {
			super();
			this.department = department;
		}
		
		public Patient getPatient_id() {
			return patient_id;
		}
		public void setPatient_id(Patient patient_id) {
			this.patient_id = patient_id;
		}
		public Doctor getDoctor_id() {
			return doctor_id;
		}
		public void setDoctor_id(Doctor doctor_id) {
			this.doctor_id = doctor_id;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		
		@Override
		public String toString() {
			return "Appointment [id=" + id + ", type=" + type + ", ward=" + ward + ", patient_id=" + patient_id
					+ ", doctor_id=" + doctor_id + ", department=" + department + "]";
		}
		public Appointment getAppointment() {
			// TODO Auto-generated method stub
			return this;
		}
		
	}
