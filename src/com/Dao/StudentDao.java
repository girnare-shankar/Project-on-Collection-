package com.Dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

public class StudentDao {

	public List<Student> getAllStudent() {

		List<Student> db = new ArrayList<Student>();

		db.add(new Student(101, 89, "Saurabh"));
		db.add(new Student(102, 90, "Devendra"));
		db.add(new Student(103, 91, "Kunal"));
		db.add(new Student(104, 96, "Ajay"));
		db.add(new Student(105, 78, "Shiv"));

		return db;
	}

}
