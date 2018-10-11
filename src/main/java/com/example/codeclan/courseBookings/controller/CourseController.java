package com.example.codeclan.courseBookings.controller;

import com.example.codeclan.courseBookings.models.Course;
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
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/rating/{starRating}")
    public List<Course> getCoursesByRating(@PathVariable int starRating){
        return courseRepository.getAllCoursesWithRating(starRating);
    }

    @GetMapping(value = "/customer/{id}")
    public List<Course> getAllCoursesForCustomer(@PathVariable Long id){
        return courseRepository.getAllCoursesForCustomer(id);
    }



}
