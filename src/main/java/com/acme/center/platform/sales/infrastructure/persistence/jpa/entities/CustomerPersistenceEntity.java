package com.acme.center.platform.sales.infrastructure.persistence.jpa.entities;

import com.acme.center.platform.sales.domain.model.valueobjets.Dni;
import com.acme.center.platform.sales.domain.model.valueobjets.Name;
import com.acme.center.platform.sales.infrastructure.persistence.jpa.converters.DniPersistenceConverter;
import com.acme.center.platform.sales.infrastructure.persistence.jpa.converters.EMailPersistenceConverter;
import com.acme.center.platform.sales.infrastructure.persistence.jpa.converters.NamePersistenceConverter;
import com.acme.center.platform.shared.infrastructure.jpa.entities.AuditableAbstractPersistenceEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;


@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerPersistenceEntity extends AuditableAbstractPersistenceEntity {
    @Convert(converter = NamePersistenceConverter.class)
    @Column(name = "name", nullable = false, updatable = true)
    private Name name;
    @Convert(converter = EMailPersistenceConverter.class)
    @Column(name = "email", nullable = false, updatable = true, unique = true)
    private Email email;
    @Convert(converter = DniPersistenceConverter.class)
    @Column(name = "dni", nullable = false, updatable = true, unique = true)
    private Dni dni;
}
