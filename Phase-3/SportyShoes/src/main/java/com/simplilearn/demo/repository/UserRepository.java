package com.simplilearn.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.demo.model.User;
public interface UserRepository extends JpaRepository<User, Long> {
  List<User> findByUID(Long UID);
  
 
}