package com.example.codeclan.courseBookings.components;

import com.example.codeclan.courseBookings.models.Booking;
import com.example.codeclan.courseBookings.models.Course;
import com.example.codeclan.courseBookings.models.Customer;
import com.example.codeclan.courseBookings.repositories.bookingrepository.BookingRepository;
import com.example.codeclan.courseBookings.repositories.courserepository.CourseRepository;
import com.example.codeclan.courseBookings.repositories.customerrepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Customer customer1 = new Customer("Wojtek", "Glasgow", 35);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Sue", "Edinburgh", 20);
        customerRepository.save(customer2);

        Course course1 = new Course("Agile", "Inverness", 3);
        courseRepository.save(course1);

        Course course2 = new Course("UX", "Glasgow", 5);
        courseRepository.save(course2);

        Booking booking1 = new Booking("20-10-18", customer1, course2);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("25-11-18", customer2, course1);
        bookingRepository.save(booking2);
    }
}
