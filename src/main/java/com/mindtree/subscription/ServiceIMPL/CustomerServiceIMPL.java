package com.mindtree.subscription.ServiceIMPL;

import com.mindtree.subscription.Entity.CustomerEntity;
import com.mindtree.subscription.Respository.CustomerRespostory;
import com.mindtree.subscription.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRespostory customerRespostory;

    @Override
    public CustomerEntity saveCustomer(CustomerEntity customerEntity) {
        return customerRespostory.save(customerEntity);
    }
}
