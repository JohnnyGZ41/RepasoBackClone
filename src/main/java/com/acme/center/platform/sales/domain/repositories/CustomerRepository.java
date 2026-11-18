package com.acme.center.platform.sales.domain.repositories;

import com.acme.center.platform.sales.domain.model.aggregates.Customer;

import java.util.Optional;

public interface CustomerRepository {

     Optional<Customer> findById(Long id);
     Customer save(Customer customer);
     Optional<Customer> findByDni(String dni);
     Customer update(Customer customer);
     void deleteById(Long id);
}
