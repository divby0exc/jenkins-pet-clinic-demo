package com.divby0exc.petclinic.repository;

import com.divby0exc.petclinic.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IRepository  extends JpaRepository<Customer, Long> {
}
