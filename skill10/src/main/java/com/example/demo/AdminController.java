package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@Autowired 
	private FoodRepo frepo;
	
	@Autowired 
	private ServiceClass serv;
	
	@Autowired 
	private OrdersRepo orepo;
	
	@Autowired 
	private PaymentsRepo prepo;
	
	@Autowired 
	private HotelRepo hrepo;
	
	@RequestMapping("/hotels")
	private ResponseEntity<Object> hotels(){
		
		return new ResponseEntity<>(this.hrepo.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/addHotel")
	private ResponseEntity<Object> AddHotel(@RequestBody Hotel hotel){
		this.hrepo.save(hotel);
		return new ResponseEntity<>("Hotel added successfully", HttpStatus.CREATED);
	}
	
	@RequestMapping("/orders")
	private ResponseEntity<Object> orders(){
		return new ResponseEntity<>(this.orepo.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/placeOrder")
	private ResponseEntity<Object> placeOrders(@RequestBody Orders order){
		order.setTotalcost(order.getCostperplate()*order.getNoofplates());
		this.orepo.save(order);
		return new ResponseEntity<>("Order placed successfully", HttpStatus.CREATED);
	}

	@PostMapping("/makePayment/{oid}")
	private ResponseEntity<Object> makePayments(@RequestBody Payments payments,@PathVariable("oid") int oid){
		
		payments.setOid(oid);
		payments.setDatepaid(new java.util.Date());
		this.prepo.save(payments);
		return new ResponseEntity<>("Payment placed successfully", HttpStatus.CREATED);
	}
	
	@RequestMapping("/payments")
	private ResponseEntity<Object> payments(){
		return new ResponseEntity<>(this.prepo.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping("/food")
	private ResponseEntity<Object> food(){
		return new ResponseEntity<>(this.frepo.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/addFood")
	private ResponseEntity<Object> AddFood(@RequestBody Food food){
		this.frepo.save(food);
		return new ResponseEntity<>("Food added successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/food/{id}")
	private Object foodById(@PathVariable("id") int id){
		return new ResponseEntity<>(this.frepo.findById(id), HttpStatus.OK);
	}
	
	
}
