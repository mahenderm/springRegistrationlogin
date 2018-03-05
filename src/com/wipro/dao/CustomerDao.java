package com.wipro.dao;

import com.wipro.model.Customer;

public interface CustomerDao {
	public void saveCustomer(Customer customer);
	public Customer loginCustomer(Customer customer);

}
