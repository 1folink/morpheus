package com.infolink.morpheus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.infolink.morpheus.entity.JobRequirement;

@RepositoryRestResource(collectionResourceRel = "job_requirement", path = "job/requirement")
public interface JobRequirementRepository  extends PagingAndSortingRepository<JobRequirement, Long> {

}
