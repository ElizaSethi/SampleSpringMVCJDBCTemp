package com.springMVC.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springMVC.model.Student;

public class StudentDao {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Student getStudentById(int std_id) {
		String sql = "select *, student_id as std_id, student_name as name, email_address as email from student_record where student_id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { std_id },
				new BeanPropertyRowMapper<Student>(Student.class));
	}

	public List<Student> getStudents() {
		return jdbcTemplate.query("select * from student_record", new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int row) throws SQLException {
				Student std = new Student();
				std.setStd_id(rs.getInt(1));
				std.setName(rs.getString(2));
				std.setDob(rs.getString(3));
				std.setDepartment(rs.getString(4));
				std.setEmail(rs.getString(5));
				std.setAddress(rs.getString(6));
				return std;
			}
		});
	}

	public int save(Student student) {
		String query = "insert into student_record (student_name, dob, department, email_address, address) values "
				+ "('" + student.getName() + "', '" + student.getDob() + "', '" + student.getDepartment() + "', '"
				+ student.getEmail() + "', '" + student.getAddress() + "')";
		return jdbcTemplate.update(query);

	}

	public int update(Student student) {
		String query = "update student_record set student_name = '" + student.getName() + "', dob = '"
				+ student.getDob() + "', " + "department = '" + student.getDepartment() + "',  email_address = '"
				+ student.getEmail() + "', address =  '" + student.getAddress() + "' " + "where student_id = "
				+ student.getStd_id() + "";
		return jdbcTemplate.update(query);
	}

	public int delete(int std_id) {
		String query = "delete from student_record where student_id=" + std_id;
		return jdbcTemplate.update(query);
	}

}
