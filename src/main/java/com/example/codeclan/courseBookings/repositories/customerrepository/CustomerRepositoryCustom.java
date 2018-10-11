package com.example.codeclan.courseBookings.repositories.customerrepository;

import com.example.codeclan.courseBookings.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getAllCustomersForCourse(Long course_id);
}
