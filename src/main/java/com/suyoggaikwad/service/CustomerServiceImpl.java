package com.suyoggaikwad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suyoggaikwad.dao.CustomerDao;
import com.suyoggaikwad.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	@Override
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}
	
	@Transactional
	@Override
	public void saveCustomer(Customer theCustomer) {
		customerDao.saveCustomer(theCustomer);
		
	}

	@Transactional
	@Override
	public Customer getCustomer(int id) {
		return customerDao.getCustomer(id);
	}

	@Transactional
	@Override
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}
	

	
}
