package com.example.hostelproject.Rooms;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {
  private final RoomService service;

  @PostMapping("/create")
  public Rooms addRoom(@RequestBody Rooms room) {
    return  service.save(room);
  }

  @GetMapping("/find-by-name")
  public Optional<Rooms> findRoomByName(String roomName) {
    return service.findByName(roomName);
  }

  @GetMapping("/get-all-rooms")
  public List<Rooms> fetchAllRooms() {
    return service.fetchAllRooms();
  }

  @GetMapping("/number-of-students")
  public List<Rooms> fetchRoomsByStudentNumber(Long number) {
    return service.findByNumberOfStudents(number);
  }
  @GetMapping("/room-by-price")
  public List<Rooms> fetchRoomsByPrice(Double price) {
    return service.findRoomByPrice(price);
  }
  @DeleteMapping("/delete/{roomId}")
  public void deleteRoom(@PathVariable("roomId") Long roomId) {
    service.delete(roomId);
  }
}
