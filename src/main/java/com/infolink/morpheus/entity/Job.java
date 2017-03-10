package com.infolink.morpheus.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String description;
	
	// TODO : Join table
	private List<JobRequirement> requirements;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<JobRequirement> getRequirements() {
		return requirements;
	}

	public void setRequirements(List<JobRequirement> requirements) {
		this.requirements = requirements;
	}
	
}
