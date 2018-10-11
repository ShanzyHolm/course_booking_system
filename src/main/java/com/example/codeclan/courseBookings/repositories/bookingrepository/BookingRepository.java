package com.example.codeclan.courseBookings.repositories.bookingrepository;

import com.example.codeclan.courseBookings.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
