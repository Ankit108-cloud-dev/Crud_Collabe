package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository sr;
	
	
	@Override
	public Student saveStudentData(Student s) {

		Student stu=sr.save(s);
		
		return stu;
	}
	

}
