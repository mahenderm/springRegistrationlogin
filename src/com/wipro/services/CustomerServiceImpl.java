package com.wipro.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.dao.CustomerDao;
import com.wipro.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer loginCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
