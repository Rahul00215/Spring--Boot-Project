package com.rahul.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.Model.StudentMod;
import com.rahul.dao.StudentRespo;
@Service
public class StudentServ {
     
	@Autowired
	StudentRespo sr;
	
	public StudentMod get(long rn) {
		return sr.findById(rn).get();
		
	}

	
}
