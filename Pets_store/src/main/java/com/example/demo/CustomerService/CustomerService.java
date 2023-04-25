package com.example.demo.CustomerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CustomerDetails.CustomerDetails;
import com.example.demo.CustomerRepo.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	CustomerRepo repo;
	public CustomerDetails savepet(CustomerDetails det)
	{
		return repo.save(det);
	
	}
	public List<CustomerDetails>getCustomer()
	{
		return repo.findAll();
	}
	public Optional<CustomerDetails>getCustomerById(int id)
	{
		return repo.findById(id);		
	}
	public String getSave(CustomerDetails det) {
		repo.save(det);
		return "Update";
		
	}
	public String delete(int id) {
		repo.deleteById(id);
		return "deleted";
	}
	
}
