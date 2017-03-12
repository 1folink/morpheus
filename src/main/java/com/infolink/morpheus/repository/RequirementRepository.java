package com.infolink.morpheus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.infolink.morpheus.entity.Requirement;

@RepositoryRestResource(collectionResourceRel = "requirement", path = "requirement")
public interface RequirementRepository  extends PagingAndSortingRepository<Requirement, Long> {

}
