package com.abhi.schooldatamanagement.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
	private Integer id;
	private String name;
	private String email;
	private String subject;
	private Double sal;
	private Date dateOfJoining;
	private String classTeacher;
	private String password;

}
