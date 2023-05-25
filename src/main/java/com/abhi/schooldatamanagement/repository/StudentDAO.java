package com.abhi.schooldatamanagement.repository;

import java.util.List;

import com.abhi.schooldatamanagement.dto.Student;

public interface StudentDAO {
	Student studentLogin(String email, String password);

	String saveStudent(Student student);

	String updateStudent(Student student);

	Student getStudentById(int id);

	List<Student> getAllStudent();

	Student deleteStudentById(int id);

}
