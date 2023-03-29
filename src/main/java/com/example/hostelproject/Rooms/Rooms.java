package com.example.hostelproject.Rooms;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "Rooms")
public class Rooms {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(updatable = false)
  Long roomID;
  private String block;
  @Column(length = 10)
  private String roomName;
  private Double price;

  private Long numberOfStudents;
}
