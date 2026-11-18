package com.acme.center.platform.sales.application.internal.comandserviceimpl;

import com.acme.center.platform.sales.application.commands.CreateCustomerCommand;
import com.acme.center.platform.sales.application.commandservices.CustomerCommandService;
import com.acme.center.platform.sales.domain.model.aggregates.Customer;
import com.acme.center.platform.sales.domain.model.valueobjets.Dni;
import com.acme.center.platform.sales.domain.model.valueobjets.EMail;
import com.acme.center.platform.sales.domain.model.valueobjets.Name;
import com.acme.center.platform.sales.domain.repositories.CustomerRepository;
import jakarta.validation.constraints.Email;
import org.springframework.stereotype.Service;

@Service
public class CustomerCommandServiceImpl implements CustomerCommandService {

    private final CustomerRepository repository;

    public CustomerCommandServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer handle(CreateCustomerCommand command) {
         if(command==null){
             throw new IllegalArgumentException("command is null");
         }
        var customer = new Customer(new Name(command.name()),
                new EMail(command.email()), new Dni(command.dni()));
        return repository.save(customer);
    }
}
