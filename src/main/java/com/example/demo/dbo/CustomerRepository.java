package com.example.demo.dbo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
