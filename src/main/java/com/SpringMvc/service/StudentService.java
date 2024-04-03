 package com.SpringMvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
	
	public List<String> getGenders(){
		
		List<String> genders = new ArrayList<>();
		genders.add("Male");
		genders.add("Fe-Male");
		return genders;
		}
	
	public List<String> getCourses(){
		List<String> courses = new ArrayList<>();
		courses.add("Core Java");
		courses.add("Spring FrameWork");
		courses.add("Spring Mvc");
		courses.add("Rest Api");
		courses.add("Spring Boot");
		courses.add("Spring Microservices");
		
	
		return courses;
	}

	public List<String> getTimings(){
		List<String> timings = new ArrayList<>();
		timings.add("Morning");
		timings.add("Evening");
		timings.add("Afternoon");
		
		return timings;
}}
