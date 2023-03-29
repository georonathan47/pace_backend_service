package com.example.hostelproject.students;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="Students")
@Data

public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "studentID", updatable = false)
  Long studentID;
  @Column(length = 50, updatable = true)
  String firstName;
  @Column(length = 50, updatable = true)
  String lastName;
  @Column(length = 50, updatable = true, nullable = true)
  String middleName;
  @Column(length = 150, updatable = true)
  String programmeOfStudy;
  @Column(length = 50, updatable = true)
  String email;
}
