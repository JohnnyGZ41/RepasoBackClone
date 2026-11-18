package com.acme.center.platform.sales.infrastructure.persistence.jpa.converters;

import com.acme.center.platform.sales.domain.model.valueobjets.Dni;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class NamePersistenceConverter implements AttributeConverter<Dni, String> {
    @Override
    public String convertToDatabaseColumn(Dni attribute) {
        return attribute==null ?  null : attribute.dni();
    }

    @Override
    public Dni convertToEntityAttribute(String dbData) {
        return dbData==null ? null : new Dni(dbData);
    }
}
