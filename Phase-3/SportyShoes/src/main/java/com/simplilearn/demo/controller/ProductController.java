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
import com.simplilearn.demo.model.Product;
import com.simplilearn.demo.repository.ProductRepository;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ProductController {
  @Autowired
  ProductRepository productRepository;
  @GetMapping("/product")
  public ResponseEntity<List<Product>> getAllTutorials() {
    List<Product> product = new ArrayList<Product>();
    
      productRepository.findAll().forEach(product::add);
    
    if (product.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    return new ResponseEntity<>(product, HttpStatus.OK);
  }
  @GetMapping("/product/{PID}")
  public ResponseEntity<Product> getTutorialById(@PathVariable("PID") long PID) {
    Product products = productRepository.findById(PID)
        .orElseThrow();
    return new ResponseEntity<>(products, HttpStatus.OK);
  }
  @PostMapping("/product")
  public ResponseEntity<Product> createTutorial(@RequestBody Product products) {
    Product _product = productRepository.save(new Product(products.getCID(), products.getQuantity(), products.getPrice(), products.getDes()));
    return new ResponseEntity<>(_product, HttpStatus.CREATED);
  }
  @PutMapping("/product/{PID}")
  public ResponseEntity<Product> updateTutorial(@PathVariable("PID") long PID, @RequestBody Product products) {
    Product _product = productRepository.findById(PID)
        .orElseThrow();
    _product.setCID(products.getCID());
    _product.setQuantity(products.getQuantity());
    _product.setPrice(products.getPrice());
    _product.setDes(products.getDes());
   
    
    return new ResponseEntity<>(productRepository.save(_product), HttpStatus.OK);
  }
 
  
}