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
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "studentID", updatable = false)
  Long studentID;
  @Column(length = 50)
  private String firstName;
  @Column(length = 50)
  private String lastName;
  private @Column(length = 50)
  String middleName;
  @Column(length = 150)
  private String programmeOfStudy;
  @Column(length = 50)
  private String email;
}
