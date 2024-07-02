package com.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cjc.main.model.Student;
import com.cjc.main.service.StudentService;

import ch.qos.logback.core.joran.spi.NoAutoStart;

public class StudentController {
	
	@Autowired private StudentService st;
	
	@GetMapping("viewAllStudent")
	public ResponseEntity<Student> viewData(@RequestBody Student student){
		
		st.viewAllData(student);
		
		
	}

}
