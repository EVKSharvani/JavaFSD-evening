package com.simplilearn.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.demo.model.Orders;
public interface OrdersRepository extends JpaRepository<Orders, Long> {
  List<Orders> findByOID(Long OID);
  
 
}