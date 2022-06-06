package com.project.coursesapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.coursesapi.models.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, String>{

	// using find tells Spring API to use a find type method, by suggests the field or column in database
	// with this Spring will implement the method for you!
	public List<Course> findByName(String name);
	public List<Course> findByDescription(String description);
	public List<Course> findByTopicId(String topicId); // tell spring to look for the topic id field in topic within the course object
}