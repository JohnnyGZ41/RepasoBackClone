package com.acme.center.platform.sales.domain.model.valueobjets;

import com.acme.center.platform.sales.domain.exceptions.EMaiInvalidException;

public record Name(String name) {
    public Name{
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
    }
}
