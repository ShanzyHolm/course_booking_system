package com.example.codeclan.courseBookings.repositories.bookingrepository;

import com.example.codeclan.courseBookings.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> getAllBookingsForDate(String date);

}
