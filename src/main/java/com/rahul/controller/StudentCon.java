package com.rahul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.Model.StudentMod;
import com.rahul.Service.StudentServ;

@RestController
public class StudentCon {
      
	@Autowired
	StudentServ ss;
	
	@GetMapping("/std")
	public StudentMod get(@RequestParam("rollno") long rn) {
		return ss.get(rn);
		
	}
}
