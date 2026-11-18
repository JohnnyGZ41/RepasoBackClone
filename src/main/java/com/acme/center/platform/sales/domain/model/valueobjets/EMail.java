package com.acme.center.platform.sales.domain.model.valueobjets;

import com.acme.center.platform.sales.domain.exceptions.EMaiInvalidException;

public record EMail(String email) {

    public EMail {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        if (email.matches("^[uU][0-9]{8}$")){
            throw new EMaiInvalidException("Invalid email address");
        }
    }
}
