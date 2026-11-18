package com.acme.center.platform.sales.infrastructure.persistence.jpa.adapters;

import com.acme.center.platform.sales.domain.model.aggregates.Customer;
import com.acme.center.platform.sales.domain.repositories.CustomerRepository;
import com.acme.center.platform.sales.infrastructure.persistence.jpa.mappers.CustomerPersistenceMapper;
import com.acme.center.platform.sales.infrastructure.persistence.jpa.repositories.CustomerJpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class CustomerPersistenceAdapter implements CustomerRepository {

    private final CustomerJpaRepository repository;


    public CustomerPersistenceAdapter(CustomerJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Customer save(Customer customer) {
        if (customer == null) {
            return null;
        }
        var  result = repository.save(CustomerPersistenceMapper.toEntity(customer));
        return CustomerPersistenceMapper.toDomain(result);
    }

    @Override
    public Optional<Customer> findByDni(String dni) {
        return Optional.empty();
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
