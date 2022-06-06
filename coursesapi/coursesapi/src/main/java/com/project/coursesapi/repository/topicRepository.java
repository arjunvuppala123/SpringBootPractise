package com.project.coursesapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.coursesapi.models.Topics;

@Repository
public interface topicRepository extends CrudRepository<Topics, String>{

}