package com.abhi.schooldatamanagement.service;

import java.util.List;

import com.abhi.schooldatamanagement.dto.Student;

public interface StudentService {
	Student studentLogin(String email, String password);

	String saveStudent(Student student);

	String updateStudent(Student student);

	Student getStudentById(int id);

	List<Student> getAllStudent();

	Student deleteStudentById(int id);

	List<Student> sortedbyName();

	List<Student> sortedbyClass();

	List<Student> sortedbyThroughtPercentage();

}
