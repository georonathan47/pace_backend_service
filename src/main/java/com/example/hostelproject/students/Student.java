package com.example.hostelproject.students;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Entity(name="Students")
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  String studentId;
  String firstName;
  String lastName;
  String programmeOfStudy;


}
