package com.infolink.morpheus.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String firstName;
	
	private String lastName;
	
	@Email
	private String email;
	
	private String phone;
	
	private String office;
	
	// TODO : Join table
	private List<Job> jobs;
	
	// TODO : Join table
	private List<Skill> skills;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
