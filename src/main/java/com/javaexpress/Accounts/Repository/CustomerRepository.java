package com.javaexpress.Accounts.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaexpress.Accounts.model.Customer;



@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
