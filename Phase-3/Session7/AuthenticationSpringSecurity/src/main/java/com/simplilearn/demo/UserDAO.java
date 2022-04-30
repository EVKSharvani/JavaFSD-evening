package com.simplilearn.demo;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

//use autowire this FeeedbackDao object to main controller
@Repository
public class UserDAO {

	@Autowired
	JdbcTemplate template;
	
	// setter method
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<User> getDetails() {
		return template.query("select * from users", new RowMapper<User>() {
			public User mapRow(ResultSet rs, int row) throws SQLException {
				User e = new User();
				e.setID(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPwd(rs.getString(3));
				e.setRole(rs.getString(4));
				return e;
			}
		});
	}

	
	public User getByName(String name) {
		User entity = template.queryForObject("select * from users where name=?",
				BeanPropertyRowMapper.newInstance(User.class), name);
		return entity;
	}
}