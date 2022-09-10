package com.iamsajan.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iamsajan.main.model.Course;
import com.iamsajan.main.model.Teacher;
import com.iamsajan.main.repository.CourseRepository;
import com.iamsajan.main.repository.TeacherRepository;

@SpringBootApplication
public class SpringDataJpaOneToManyMappingApplication implements CommandLineRunner {

	@Autowired
	private TeacherRepository teacherRepository;

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaOneToManyMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Create Course instances
		Course course1 = new Course("Spring Boot", "Spring Boot Jpa Hibernate one to many mapping", true);
		Course course2 = new Course("Angular", "Advance Angular Programming", true);
		Course course3 = new Course("React", "Advance React Programming", true);

		// Save Courses
		courseRepository.save(course1);
		courseRepository.save(course2);
		courseRepository.save(course3);

		// Create Teacher instance
		Teacher teacher = new Teacher("Sajan K.C.", "test@gmail.com", List.of(course1, course2, course3));

		// Save Teacher with Courses
		teacherRepository.save(teacher);

	}

}
