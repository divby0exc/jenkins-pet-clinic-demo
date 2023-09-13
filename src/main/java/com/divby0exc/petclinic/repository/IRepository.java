package com.divby0exc.petclinic.repository;

import com.divby0exc.petclinic.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IRepository extends JpaRepository<Customer, Long> {
    @Override
    List<Customer> findAll();
}
