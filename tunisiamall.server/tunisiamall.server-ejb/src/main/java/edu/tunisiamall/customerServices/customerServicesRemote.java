package edu.tunisiamall.customerServices;

import java.util.List;

import javax.ejb.Remote;

import edu.tunisiamall.entities.Customer;





@Remote
public interface customerServicesRemote {
	
	public List<Customer> findAllCos();
	void create(Customer cust);
	public void delete(Customer cust);
	public void updateCustomer(Customer cust);
	public List<Customer> find(String chaine,String value);
	public long count();
}
