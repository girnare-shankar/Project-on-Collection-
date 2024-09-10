package com.controller;

import java.util.List;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {
	
	StudentService service=null;
	
	public List<Student> getStudentController(){
		
		service=new StudentService();
		
		List<Student> db = service.getStudentService();
		
		return db;
	}

	public List<Student> getStudentNameStartWithChar(String string) {
		service= new StudentService();
		List<Student> db =  service.getStudentNameStartWithChar(string );
 		
		return db;
	}

	public List<Student> getStudentMarksAbove(int i) {
		
		service = new StudentService();
		List<Student> db = service.getStudentMarksAbove(i); 
		
		return db;
		
	}

	public List<Student> getStudentByRollNum(int i) {
		
		service = new StudentService();
		List<Student> db= service.getStudentByRollNum(i);
		
		return db;
	}

	public List<Student> getStudentByReverse() {
		service = new StudentService();
		List<Student> db=service.getStudentByReverse() ;
				
		return db;
	}

}
