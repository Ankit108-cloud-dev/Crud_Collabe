package com.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cjc.main.model.Student;
import com.cjc.main.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired private StudentService st;
	
	@GetMapping("/viewAllStudent")
	public ResponseEntity<Iterable<Student>> viewData(){
		
		Iterable<Student> student2=st.viewAllData();
		
		return new ResponseEntity<Iterable<Student>>(student2, HttpStatusCode.valueOf(200));
		
		
	}

}
