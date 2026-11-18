package com.acme.center.platform.sales.interfaces.controllers;

import com.acme.center.platform.sales.application.commandservices.CustomerCommandService;
import com.acme.center.platform.sales.interfaces.resources.CustomerRequestResource;
import com.acme.center.platform.sales.interfaces.resources.CustomerRequestResponse;
import com.acme.center.platform.sales.interfaces.transforms.CustomerTransform;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerCommandService service;
    public CustomerController(CustomerCommandService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<CustomerRequestResponse> createCustomer(
        @RequestBody CustomerRequestResource resource
    ){
        var result = service
                .handle(CustomerTransform.toCreateCustomerCommandFromCustomerResource(resource));
        var responser = CustomerTransform.toCreateCustomerRequestResponseFromCustomerDomain(result);
       return   ResponseEntity.ok(responser);
    }


}
