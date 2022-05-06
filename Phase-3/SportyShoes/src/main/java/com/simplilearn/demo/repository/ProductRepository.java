package com.simplilearn.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.demo.model.Product;
public interface ProductRepository extends JpaRepository<Product, Long> {
  List<Product> findByCID(long CID);
  List<Product> findByPID(long PID);
}