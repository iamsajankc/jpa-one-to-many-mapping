package com.iamsajan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iamsajan.main.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
