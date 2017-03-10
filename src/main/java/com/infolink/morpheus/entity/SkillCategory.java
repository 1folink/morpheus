package com.infolink.morpheus.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SkillCategory {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String description;
	
	private Integer priority;
	
	private SkillCategory parent;
	
	// TODO : reflective join id/parent
	private List<SkillCategory> childs;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public SkillCategory getParent() {
		return parent;
	}

	public void setParent(SkillCategory parent) {
		this.parent = parent;
	}

	public List<SkillCategory> getChilds() {
		return childs;
	}

	public void setChilds(List<SkillCategory> childs) {
		this.childs = childs;
	}
	
	
}
