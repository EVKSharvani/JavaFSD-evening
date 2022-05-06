package com.simplilearn.demo.controller;



import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.simplilearn.demo.model.User;
import com.simplilearn.demo.repository.UserRepository;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class UserController {
  @Autowired
  UserRepository userRepository;
  @GetMapping("/user")
  public ResponseEntity<List<User>> getAllTutorials() {
    List<User> user = new ArrayList<User>();
   
      userRepository.findAll().forEach(user::add);
  
    if (user.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    return new ResponseEntity<>(user, HttpStatus.OK);
  }
  @GetMapping("/user/{UID}")
  public ResponseEntity<User> getTutorialById(@PathVariable("UID") long UID) {
	  User users = userRepository.findById(UID)
        .orElseThrow();
    return new ResponseEntity<>(users, HttpStatus.OK);
  }
  @PostMapping("/user")
  public ResponseEntity<User> createTutorial(@RequestBody User users) {
   User _user = userRepository.save(new User(users.getName(), users.getEmail(), users.getPwd(), users.getAddress()));
    return new ResponseEntity<>(_user, HttpStatus.CREATED);
  }
  @PutMapping("/user/{UID}")
  public ResponseEntity<User> updateTutorial(@PathVariable("UID") long UID, @RequestBody User users) {
    User _user = userRepository.findById(UID)
        .orElseThrow();
    _user.setName(users.getName());
    _user.setEmail(users.getEmail());
    _user.setPwd(users.getPwd());
    _user.setAddress(users.getAddress());
   
    
    return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
  }
 
  
}