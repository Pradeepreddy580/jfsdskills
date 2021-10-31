package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@Autowired
	private CourseRepo crepo;
	
	@Autowired
	private TopicRepo trepo;
	
	@RequestMapping("/courses")
	private ResponseEntity<Object> Courses(){
		
		return new ResponseEntity<>(this.crepo.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping("/course/{id}")
	private ResponseEntity<Object> courseByID(@PathVariable("id") int id){
		return new ResponseEntity<>(this.crepo.findById(id), HttpStatus.OK);
	}
	
	@PostMapping("/addCourse")
	private ResponseEntity<Object> AddCourse(@RequestBody Course course){
		this.crepo.save(course);
		return new ResponseEntity<>("Course added successfully", HttpStatus.CREATED);
	}
	
	
	@RequestMapping("/topics/{id}")
	private ResponseEntity<Object> topicsByID(@PathVariable("id") int id){
		return new ResponseEntity<>(this.trepo.findByCId(id), HttpStatus.OK);
	}
	
	@PostMapping("/addTopic/{id}")
	private ResponseEntity<Object> AddCourse(@RequestBody Topic topic,@PathVariable("id") int id){
		topic.setCid(id);
		this.trepo.save(topic);
		return new ResponseEntity<>("Topic added successfully", HttpStatus.CREATED);
	}
}
