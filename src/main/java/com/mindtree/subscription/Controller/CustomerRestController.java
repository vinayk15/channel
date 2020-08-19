package com.mindtree.subscription.Controller;

import com.mindtree.subscription.Entity.CustomerEntity;
import com.mindtree.subscription.Service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user/v1")
public class CustomerRestController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerRestController.
            class);

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String customerSave(@RequestBody CustomerEntity customer) throws Exception {
        logger.info("Enter Inside customer Save (){}");
        CustomerEntity customerEntity = customerService.saveCustomer(customer);
        if (customerEntity == null) {
            throw new Exception("Customer registration failed !!!");
        }

        return "Customer Registration Successfully";
    }
}
