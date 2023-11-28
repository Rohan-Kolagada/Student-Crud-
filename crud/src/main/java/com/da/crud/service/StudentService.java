package com.da.crud.service;

import java.util.List;

import com.da.crud.entity.Student;

//import net.javaguides.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}





/*

*Rohan Kolagada* 
*Matriculation Number: 1491490*
*Created: 06/11/2023*

*/