package com.infolink.morpheus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.infolink.morpheus.entity.Job;

@RepositoryRestResource(collectionResourceRel = "job", path = "job")
public interface JobRepository  extends PagingAndSortingRepository<Job, Long> {

}
