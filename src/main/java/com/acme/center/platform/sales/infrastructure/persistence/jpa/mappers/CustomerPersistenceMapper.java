package com.acme.center.platform.sales.infrastructure.persistence.jpa.mappers;

import com.acme.center.platform.sales.domain.model.aggregates.Customer;
import com.acme.center.platform.sales.infrastructure.persistence.jpa.entities.CustomerPersistenceEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerPersistenceMapper {

    public static Customer toDomain(CustomerPersistenceEntity entity){
        return  new Customer(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getDni()
        );

    }
    public static CustomerPersistenceEntity toEntity(Customer customer){
        return  CustomerPersistenceEntity.builder()
                .name(customer.getName())
                .email(customer.getEmail())
                .dni(customer.getDni())
                .build();
    }


}
