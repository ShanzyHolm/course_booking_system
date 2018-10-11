package com.example.codeclan.courseBookings.controller;

import com.example.codeclan.courseBookings.models.Customer;
import com.example.codeclan.courseBookings.repositories.bookingrepository.BookingRepository;
import com.example.codeclan.courseBookings.repositories.courserepository.CourseRepository;
import com.example.codeclan.courseBookings.repositories.customerrepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/course/id/{id}")
    public List<Customer> getCustomersForCourse(@PathVariable Long id){
        return customerRepository.getAllCustomersForCourse(id);
    }

}
