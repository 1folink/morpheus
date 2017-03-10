package com.infolink.morpheus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobRequirement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	// TODO : Join table
	private SkillCategory skill;
	
	private Integer level;
	
	private Integer years;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SkillCategory getSkill() {
		return skill;
	}

	public void setSkill(SkillCategory skill) {
		this.skill = skill;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}
	
	
}
