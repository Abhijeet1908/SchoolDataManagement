package com.abhi.schooldatamanagement.util;

public interface AppConstants {
	String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	String URL="";
	String USER_NAME="root";
	String USER_PASSWORD="root";
	String ADMIN_LOGIN="SELECT * FROM admin WHERE email=? AND password=?";
}
