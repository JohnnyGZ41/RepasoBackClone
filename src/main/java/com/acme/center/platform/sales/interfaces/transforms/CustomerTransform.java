package com.acme.center.platform.sales.interfaces.transforms;

import com.acme.center.platform.sales.application.commands.CreateCustomerCommand;
import com.acme.center.platform.sales.domain.model.aggregates.Customer;
import com.acme.center.platform.sales.interfaces.resources.CustomerRequestResource;
import com.acme.center.platform.sales.interfaces.resources.CustomerRequestResponse;

public class CustomerTransform {

    public static CreateCustomerCommand toCreateCustomerCommandFromCustomerResource(CustomerRequestResource
                                                                                     resource){
        return  new CreateCustomerCommand(
                resource.name(), resource.email(), resource.dni()
        );
    }

    public static CustomerRequestResponse toCreateCustomerRequestResponseFromCustomerDomain(Customer customer) {
        return new CustomerRequestResponse(
                customer.getId(), customer.getName().name(), customer.getEmail().email(), customer.getDni().dni()
        );
    }
}
