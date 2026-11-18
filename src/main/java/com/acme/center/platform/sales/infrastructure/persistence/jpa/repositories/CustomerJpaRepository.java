package com.acme.center.platform.sales.infrastructure.persistence.jpa.repositories;

import com.acme.center.platform.sales.domain.model.aggregates.Customer;
import com.acme.center.platform.sales.infrastructure.persistence.jpa.entities.CustomerPersistenceEntity;
import org.hibernate.internal.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<CustomerPersistenceEntity, Long> {

    Optional<CustomerPersistenceEntity> findByEmail(String email);

}
