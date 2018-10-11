package com.example.codeclan.courseBookings.controller;

import com.example.codeclan.courseBookings.models.Booking;
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
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getAllBookingsForDate(@PathVariable String date){
        return bookingRepository.getAllBookingsForDate(date);
    }
}
