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
public class FeedbackDAO {

	@Autowired
	JdbcTemplate template;
	
	// setter method
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<UserFeedback> getFeedback() {
		return template.query("select * from feedback1", new RowMapper<UserFeedback>() {
			public UserFeedback mapRow(ResultSet rs, int row) throws SQLException {
				UserFeedback e = new UserFeedback();
				e.setID(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPrice(rs.getString(3));
				e.setDateAdded(rs.getDate(4));
				return e;
			}
		});
	}

	

	public UserFeedback getByName(String name) {
		UserFeedback entity = template.queryForObject("select * from feedback1 where name=?",
				BeanPropertyRowMapper.newInstance(UserFeedback.class), name);
		return entity;
	}
}