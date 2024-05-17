package com.example.ReadXLSFile.repository;


import com.example.ReadXLSFile.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
