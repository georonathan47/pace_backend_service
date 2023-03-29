package com.example.hostelproject.students;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
  private final StudentService service;
  @PostMapping("/register")
  public Student addStudent(@RequestBody Student student) {
    return service.save(student);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteStudent(@PathVariable("id") Long id) {
    service.delete(id);
  }

  @GetMapping("/find-by-name")
  public void findStudent(String firstName) {
    service.findByFirstName(firstName);
  }

  @GetMapping("/find-by-id")
  public Optional<Student> findStudentByID(Long id) {
    return service.findById(id);
  }

  @GetMapping("/get-all")
  public List<Student> fetchAllStudents() {
    return service.findAll();
  }

}
