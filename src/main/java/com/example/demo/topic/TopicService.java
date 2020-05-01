package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> Topics =  Arrays.asList(
				new Topic("id" , "string" , "java"),
				new Topic("name" , "okay" , "sting")
				);
	
	public List<Topic> getAllTopics() {
		return Topics;
	}
	
	
	
	
}
