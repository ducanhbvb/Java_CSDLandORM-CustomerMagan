package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.repository.CustomerRepostory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepostory customerRepostory;

    @Override
    public List<Customer> findAllHaveBusiness() {
        return customerRepostory.findAll();
    }

    @Override
    public void saveHaveBusiness(Customer customer) {
        customerRepostory.save(customer);
    }

    @Override
    public Customer findByIdHaveBusiness(long id) {
        return customerRepostory.findById(id);
    }

    @Override
    public void updateHaveBusiness(long id, Customer customer) {
    customerRepostory.update(id,customer);
    }

    @Override
    public void removeHaveBusiness(long id) {
customerRepostory.remove(id);
    }
}
