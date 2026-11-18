package com.acme.center.platform.sales.infrastructure.persistence.jpa.converters;

import com.acme.center.platform.sales.domain.model.valueobjets.EMail;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class DniPersistenceConverter implements AttributeConverter<EMail, String> {
    @Override
    public String convertToDatabaseColumn(EMail attribute) {
        return attribute==null ? null : attribute.email();
    }
    @Override
    public EMail convertToEntityAttribute(String dbData) {
        return dbData==null ? null : new EMail(dbData)
                ;
    }
}
