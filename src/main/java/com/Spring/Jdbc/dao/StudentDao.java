// This dao file contains the methods that perform database operation 

package com.Spring.Jdbc.dao;

import com.Spring.Jdbc.entites.Student;

public interface StudentDao {
	public int insert(Student student); // we can't write body in the interface , so we make another class

	public int change(Student student);

	public int delete(int studentId);

	// Selecting data from spring jdbc by using row mapper (it will convert result
	// set object to class object)

	public Student getStudent(int studentId);

}
