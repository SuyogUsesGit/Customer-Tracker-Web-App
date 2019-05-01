package com.suyoggaikwad.dao;

import java.util.List;

import com.suyoggaikwad.entity.Customer;

public interface CustomerDao {
	
	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);
	
	Customer getCustomer(int id);

	void deleteCustomer(int id);
}
