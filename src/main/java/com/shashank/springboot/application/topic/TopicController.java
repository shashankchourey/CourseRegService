package com.shashank.springboot.application.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}") // braces to specify this is a Variable
	public Topic getTopic(@PathVariable String id) { // This Parameter name has to be the same as specified above in the path
		
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topics") 
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
}
