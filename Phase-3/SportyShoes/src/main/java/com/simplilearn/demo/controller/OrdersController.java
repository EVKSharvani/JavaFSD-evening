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
import com.simplilearn.demo.model.Orders;
import com.simplilearn.demo.repository.OrdersRepository;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class OrdersController {
  @Autowired
  OrdersRepository ordersRepository;
  @GetMapping("/orders")
  public ResponseEntity<List<Orders>> getAllTutorials() {
    List<Orders> orders = new ArrayList<Orders>();
    
    	ordersRepository.findAll().forEach(orders::add);
    
    if (orders.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    return new ResponseEntity<>(orders, HttpStatus.OK);
  }
  @GetMapping("/orders/{OID}")
  public ResponseEntity<Orders> getTutorialById(@PathVariable("OID") long OID) {
	  Orders order = ordersRepository.findById(OID)
        .orElseThrow();
    return new ResponseEntity<>(order, HttpStatus.OK);
  }
  @PostMapping("/orders")
  public ResponseEntity<Orders> createTutorial(@RequestBody Orders order) {
	  Orders _order = ordersRepository.save(new Orders(order.getOID(), order.getPID(), order.getUID(), order.getAmount(), order.getDate_added()));
    return new ResponseEntity<>(_order, HttpStatus.CREATED);
  }
  @PutMapping("/orders/{OID}")
  public ResponseEntity<Orders> updateTutorial(@PathVariable("OID") long OID, @RequestBody Orders order) {
	  Orders _order = ordersRepository.findById(OID)
        .orElseThrow();
    _order.setPID(order.getPID());
    _order.setUID(order.getUID());
    _order.setAmount(order.getAmount());
    _order.setDate_added(order.getDate_added());
   
    
    return new ResponseEntity<>(ordersRepository.save(_order), HttpStatus.OK);
  }
 
  
}