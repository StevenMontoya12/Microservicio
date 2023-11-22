package dev.steven.springboot.services;

import dev.steven.springboot.entities.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    Customer getById(Long id);
    void remove(Long id);
    void save(Customer customer);
}
