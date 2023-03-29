package com.example.hostelproject.Rooms;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoomRepository extends JpaRepository<Rooms, Long> {
  Optional<Rooms> findRoomsByRoomID(Long roomID);

  Optional<Rooms> findRoomsByRoomName(String roomName);
  List<Rooms> findByPrice(double price);
  List<Rooms> findByNumberOfStudents(Long numnerOfStudents);
}
