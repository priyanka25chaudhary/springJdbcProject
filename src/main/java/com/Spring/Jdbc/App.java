package com.Spring.Jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.Jdbc.dao.StudentDao;
import com.Spring.Jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("My Program started.....");
		// spring jdbc=> jdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/Jdbc/config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// insert data:
		// Student student=new Student();
		// student.setId(24512);
		// student.setName("Kumar");
		// student.setCity("Kolkata");

		// int result = studentDao.insert(student);
		// System.out.println("data added "+result);

		// updating data :
		// Student student=new Student();
		// student.setId(246);
		// student.setName("Kumar");
		// student.setCity("Kolkata");

		// int result = studentDao.change(student);
		// System.out.println("data changed "+result);

		// Delete data:
	// int result = studentDao.delete(455);
	//System.out.println("deleted " + result);

		
		
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// seleting data

		
		Student student = studentDao.getStudent(24); // student data will call implementation class of getstudent from
														// studentDao then it will call getstudent from StudentDaoImpl
														// class
		System.out.println(student);

	}
}
