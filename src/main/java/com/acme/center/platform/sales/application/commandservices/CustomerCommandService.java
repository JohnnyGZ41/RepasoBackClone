package com.acme.center.platform.sales.application.commandservices;

import com.acme.center.platform.sales.application.commands.CreateCustomerCommand;
import com.acme.center.platform.sales.domain.model.aggregates.Customer;

public interface CustomerCommandService {
    Customer handle(CreateCustomerCommand command);
}
