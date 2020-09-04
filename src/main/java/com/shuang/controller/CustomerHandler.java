package com.shuang.controller;

import com.shuang.entity.Customer;
import com.shuang.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerHandler {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/findById/{id}")
    public Customer findById(@PathVariable("id") long id){
        return customerRepository.findById(id);
    }
}
