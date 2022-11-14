package com.application.springqlbh.bill;

import com.application.springqlbh.dal.Customers;
import com.application.springqlbh.dal.CustomersDal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersBill {

    CustomersDal customersDal;

    public CustomersBill(CustomersDal customersDal) {
        this.customersDal = customersDal;
    }

    public List<Customers> getAllCustomers() {
        return customersDal.findAll();
    }
}
