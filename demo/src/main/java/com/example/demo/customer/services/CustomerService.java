package com.example.demo.customer.services;


//Regra de Negócio

import com.example.demo.customer.models.Customer;
import com.example.demo.customer.repositories.ICustmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    //Porque preciso salvar os dados
    @Autowired
    private ICustmerRepository customerResitory;
    public void execute(Customer customer){
        customerResitory.save(customer);
    }
}
