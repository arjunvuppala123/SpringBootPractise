package com.project.coursesapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.coursesapi.models.Topics;

@Service
public class TopicService {
	List<Topics> topicList = new ArrayList<Topics>(Arrays.asList(
			new Topics("spring","Spring Framework","Spring Framework"),
			new Topics("java","Core Java","Core Java Description"),
			new Topics("JavaScript","Node JS","Node JS Framework")
			));
	
	public List<Topics> getAllTopics(){
		return topicList;
	}
	
	public Topics getTopic(String id) {
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topics topic) {
		topicList.add(topic);
		for (Topics topics : topicList){
			System.out.println(topics.getId() + " " + topics.getName() + " " + topics.getDescription());
		}
	}

	public void addTopic(String id, Topics topic) {
		for (int i=0; i<topicList.size();i++) {
			Topics t = topicList.get(i);
			if (t.getId().equals(id)) {
				topicList.set(i,topic);
				return;
			}
		}
		for (Topics topics : topicList){
			System.out.println(topics.getId() + " " + topics.getName() + " " + topics.getDescription());
		}
	}

	public void deleteTopic(String id) {
		topicList.removeIf(t -> t.getId().equals(id));
	}
}
