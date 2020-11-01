package com.shashank.springboot.application.topic;

public class Topic {

	private String id;
	private String name;
	private String description;


	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
