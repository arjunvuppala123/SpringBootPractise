package com.project.coursesapi.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.coursesapi.models.Topics;
import com.project.coursesapi.service.TopicService;

@RestController
public class TopicController {
	
    Logger logger = LoggerFactory.getLogger(TopicController.class);

	@Autowired
	// marks as need dependency injection
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> getTopics() {
        logger.warn("getTopics called.");

		return topicService.getTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topics getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value= "/topics")
	public Topics addTopic(@RequestBody Topics topic) {
		return topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value= "/topics/{id}")
	public Topics updateTopic(@RequestBody Topics topic, @PathVariable String id) {
		logger.warn("updateTopic called with id: " + id + ".");
        return topicService.updateTopic(topic, id);
	}

	@RequestMapping(method=RequestMethod.DELETE, value= "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		logger.warn("deleteTopic called with id: " + id + ".");
        topicService.deleteTopic(id);
	}
}