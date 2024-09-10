package com.service;

import java.util.Comparator;

import com.entity.Student;

public class StudRollCom implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return new Integer(o2.getRollno()).compareTo(o1.getRollno());
	}

}
