package com.acme.center.platform.sales.application.commands;

public record CreateCustomerCommand(
        String name,
        String email,
        String dni
) {
}
