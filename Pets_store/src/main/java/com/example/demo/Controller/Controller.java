package com.example.demo.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CustomerDetails.CustomerDetails;
import com.example.demo.CustomerService.CustomerService;

@RestController
@RequestMapping("/d")

public class Controller {
	@Autowired
	CustomerService ser;
	@PostMapping("/post")
	public CustomerDetails savepet(@RequestBody CustomerDetails det)
	{
			return ser.savepet(det);
	}
		@GetMapping("/get")
		public List<CustomerDetails>read()
		{
			return ser.getCustomer();
			
		}
		@GetMapping("/{id}")
		public Optional<CustomerDetails>readByID(@PathVariable int id)
		{
			return ser.getCustomerById(id);
		}
		@PutMapping("/{id}")
		public String update(@RequestBody CustomerDetails det)
		{
			return ser.getSave(det);
		}
		@DeleteMapping("/delete")
		public String delete(@RequestParam("fid")int id)
		{
			return ser.delete(id);	
		}
		

}
