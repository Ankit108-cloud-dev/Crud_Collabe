package com.cjc.main.service;

import com.cjc.main.model.Student;

public interface StudentService {

	public Iterable<Student> viewAllData( );
	Student saveStudentData(Student s);

}
