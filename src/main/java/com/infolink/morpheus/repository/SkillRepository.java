package com.infolink.morpheus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.infolink.morpheus.entity.Skill;

@RepositoryRestResource(collectionResourceRel = "skill", path = "skill")
public interface SkillRepository extends PagingAndSortingRepository<Skill, Long>{

}
