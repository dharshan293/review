package com.example.demo.CustomerRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CustomerDetails.CustomerDetails;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerDetails,Integer> {
	

}
