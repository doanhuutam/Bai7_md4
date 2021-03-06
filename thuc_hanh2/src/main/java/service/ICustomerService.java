package service;

import model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService{
    Page<Customer> findAll(Pageable pageable);
}