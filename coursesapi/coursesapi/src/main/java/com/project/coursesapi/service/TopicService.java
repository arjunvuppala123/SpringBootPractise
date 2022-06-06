package com.project.coursesapi.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.coursesapi.models.Topics;
import com.project.coursesapi.repository.topicRepository;


@Service
// business service is a singleton
public class TopicService {
	
    Logger logger = LoggerFactory.getLogger(TopicService.class);

    @Autowired
    private topicRepository repository;
    
	private List<Topics> topics;

	public TopicService() {
		topics = new ArrayList<>();
		topics.add(new Topics("1", "Spring", "Spring FW description"));
		topics.add(new Topics("2", "Java", "Java description"));
		topics.add(new Topics("3", "Ruby", "maybe better"));
	}
	
	
	public List<Topics> getTopics() {
		// return topics;
		List<Topics> topics = new ArrayList<>();
		repository.findAll().forEach(t -> topics.add(t));
		return topics;
	}


	public Topics getTopic(String id) {
		return repository.findById(id).get();
	}


	public Topics addTopic(Topics topic) {
		repository.save(topic);
		return topic;
	}


	public Topics updateTopic(Topics topic, String id) {
		repository.save(topic);
		return topic;

		
		//		Topic t = getTopic(id);
//		System.out.println("hello");
//        logger.warn("going to update " + id + ".");
//        logger.warn(t.toString());
//		t.setId(topic.getId());
//		t.setName(topic.getName());
//		t.setDescription(topic.getDescription());
//		return t;
	}


	public void deleteTopic(String id) {
		//Topic t = getTopic(id);
		//topics.remove(t);
		//topics.removeIf(t -> t.getId().equals(id));
		
		repository.deleteById(id);
	}
}
