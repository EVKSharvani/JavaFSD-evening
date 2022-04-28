package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	UserDAO userDAO;

	// @GetMapping("/diplay")
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public List<User> display() {
		List<User> list = userDAO.getDetails();
		return list;
	}
	@PostMapping("/add")
	public String add(@RequestBody User entity) {
		if(userDAO.add(entity)>0)
			return "Data Inserted";
		else
			return "error while Inserting DATA";
	}

	
}