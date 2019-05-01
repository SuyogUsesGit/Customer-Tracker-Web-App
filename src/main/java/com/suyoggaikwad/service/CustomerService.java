package com.suyoggaikwad.service;

import java.util.List;

import com.suyoggaikwad.entity.Customer;

public interface CustomerService {

	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int id);

	void deleteCustomer(int id); 

}
