package com.infolink.morpheus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.infolink.morpheus.entity.SkillCategory;

@RepositoryRestResource(collectionResourceRel = "skills_category", path = "skills/category")
public interface SkillCategoryRepository extends PagingAndSortingRepository<SkillCategory, Long>{

}
