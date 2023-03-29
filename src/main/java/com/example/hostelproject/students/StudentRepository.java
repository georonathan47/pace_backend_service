package com.example.hostelproject.students;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
  Optional<Student> findStudentByStudentID(Long studentID);
  Student findByEmail(String email);
  List<Student> findByFirstName(String firstName);

}
