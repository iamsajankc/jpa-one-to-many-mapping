package com.iamsajan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iamsajan.main.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
