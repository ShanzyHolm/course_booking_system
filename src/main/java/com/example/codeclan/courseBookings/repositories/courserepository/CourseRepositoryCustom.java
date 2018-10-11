package com.example.codeclan.courseBookings.repositories.courserepository;

import com.example.codeclan.courseBookings.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getAllCoursesWithRating(int starRating);

    List<Course> getAllCoursesForCustomer(Long id);

}
