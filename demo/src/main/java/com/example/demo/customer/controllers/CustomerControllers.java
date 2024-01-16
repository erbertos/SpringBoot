package com.example.demo.customer.controllers;

import com.example.demo.customer.models.Customer;
import com.example.demo.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer") //Rota e recurso que será acessado
public class CustomerControllers {


    @Autowired
    private CustomerService customerService;


    @PostMapping
    public void createCustomer(@RequestBody Customer customer){
        System.out.println(customer.toString());
    }
}
