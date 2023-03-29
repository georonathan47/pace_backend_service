package com.example.hostelproject.students;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentRepository repository;

  public List<Student> findAll() {
    return repository.findAll();
  }

  public Optional<Student> findById(Long id) {
    return repository.findStudentByStudentID(id);
  }

  public List<Student> findByFirstName(String name) {
    return repository.findByFirstName(name);
  }

  public Student save(Student student) {
    Optional<Student> optionalStudent = repository.findStudentByStudentID(student.studentID);
    if (optionalStudent.isPresent()) {
      throw new IllegalStateException("Student ID has already been taken by another user...");
    }
    return repository.save(student);
  }

  public void delete(Long id) {
    boolean exists = repository.existsById(id);
    if (!exists) {
      throw new IllegalStateException("Student with ID: " + id + " does not exist!");
    }
    repository.deleteById(id);
  }

}
