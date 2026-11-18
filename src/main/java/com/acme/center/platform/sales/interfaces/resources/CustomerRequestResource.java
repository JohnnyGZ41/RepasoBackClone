package com.acme.center.platform.sales.interfaces.resources;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CustomerRequestResource (
        @Valid
        @NotBlank
        @Pattern(regexp = "^[a-zA-Z]{2,20}$")
        String name,
        @Valid
        @NotBlank
        @Pattern(regexp = "^[uU][0-9]{8}$")
        String email,
        @Valid
        @NotBlank
        @Pattern(regexp="^[0-9]{8}$")
        String dni
){



}
