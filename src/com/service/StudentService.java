package com.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.Dao.StudentDao;
import com.entity.Student;

public class StudentService {

	StudentDao dao = null;

	public List<Student> getStudentService() {

		dao = new StudentDao();

		List<Student> db = dao.getAllStudent();

		return db;
	}

	public List<Student> getStudentNameStartWithChar(String ch) {

		List<Student> db1 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudent();

		for (Student student : db) {

			if (student.getName().startsWith(ch)) {
				System.out.println(student);
			}

		}

		return db1;
	}

	public List<Student> getStudentMarksAbove(int i) {

		List<Student> db2 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudent();

		for (Student student : db) {
			if (student.getMarks() > i) {
				System.out.println(student);
			}
		}

		return db2;
	}

	public List<Student> getStudentByRollNum(int i) {

		List<Student> db3 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllStudent();

		for (Student student : db) {
			if (student.getRollno() == i) {
				System.out.println(student);
			}
		}
		return db3;
	}

	public List<Student> getStudentByReverse() {
		dao = new StudentDao();
		
		List<Student> db = dao.getAllStudent();
		
		Collections.sort(db, new StudRollCom());

		return db;
	}

}
