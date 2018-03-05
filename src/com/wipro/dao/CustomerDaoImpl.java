package com.wipro.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		if(customer!=null){
			try{
				session.save(customer);
				tx.commit();
				session.close();
			}catch (Exception e) {
				tx.rollback();
				session.close();
				e.printStackTrace();
			}
			}
		}

	@Override
	public Customer loginCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="from com.wipro.model.Customer as where c.c_email=? and c.c_password=?";
		try {
			Query query=session.createQuery(hql);
			query.setParameter(0, customer.getC_email());
			query.setParameter(1, customer.getC_password());
			customer=(Customer)query.uniqueResult();
			tx.commit();
			session.close();
			
			
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		return customer;
		
	}
	

}
