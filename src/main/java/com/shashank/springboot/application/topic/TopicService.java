package com.shashank.springboot.application.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/*
 * Class Path Scan will Search this class and register this as a Service
 * Spring will create a Singleton Instance of this class
 * 
 * */

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("1","Spring", "Spring Boot by java brains"),
			new Topic("2", "DSA", "Data Structures by RVD"),
			new Topic("3", "PL/SQL", "DBMS by Gellar")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();	
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
