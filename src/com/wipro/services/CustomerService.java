package com.wipro.services;

import com.wipro.model.Customer;

public interface CustomerService {
	public void saveCustomer(Customer customer);
	public Customer loginCustomer(Customer customer);

}
