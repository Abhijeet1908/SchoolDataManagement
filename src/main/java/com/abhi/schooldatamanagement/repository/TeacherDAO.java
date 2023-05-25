package com.abhi.schooldatamanagement.repository;

import java.util.List;

import com.abhi.schooldatamanagement.dto.Teacher;

public interface TeacherDAO {
	Teacher teacherLogin(String email, String password);

	String saveTeacher(Teacher teacher);

	String updateTeacher(Teacher teacher);

	Teacher getTeacherById(int id);

	List<Teacher> getAllTeacher();

	Teacher deleteTeacherById(int id);

}
