package com.Spring.Jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Spring.Jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {

		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return r;
	}

	public int change(Student student) {
		// updating data
		String query = " update student set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	// deleting data
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	// selecting single student data
	public Student getStudent(int studentId) {
		String query = "select * FROM  student where id=?";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId); // this jdbcTemplate will call
	//	List<Student> student=this.jdbcTemplate.query(query, rowMapper,studentId);
		System.out.println("roomapper "+student);																	// queryforobject method
		return (Student) student;
	}
	
	
	
	
	
	
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
