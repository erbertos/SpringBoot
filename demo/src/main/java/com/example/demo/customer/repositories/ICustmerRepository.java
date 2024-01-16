package com.example.demo.customer.repositories;

import com.example.demo.customer.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
//Inidicar que é chave de primária UUID de Customer
public interface ICustmerRepository extends JpaRepository<Customer, UUID> {

}
