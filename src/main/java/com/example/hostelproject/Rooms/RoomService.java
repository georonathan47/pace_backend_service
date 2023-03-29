package com.example.hostelproject.Rooms;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomService {

  private  final RoomRepository repository;

  public List<Rooms> fetchAllRooms() {
    return repository.findAll();
  }

  public Optional<Rooms> findRoomById(Long id) {
    return repository.findRoomsByRoomID(id);
  }

  public List<Rooms> findRoomByPrice(Double price) {
    return repository.findByPrice(price);
  }

  public Optional<Rooms> findByName(String roomName) {
    return repository.findRoomsByRoomName(roomName);
  }

  public List<Rooms> findByNumberOfStudents(Long number) {
    return repository.findByNumberOfStudents(number);
  }
  public Rooms save(Rooms room) {
    Optional<Rooms> optionalRooms = repository.findRoomsByRoomID(room.roomID);
    if (optionalRooms.isPresent()) {
      throw new IllegalStateException("The Room ID has already been taken by another Room...");
    }
    return repository.save(room);
  }

  public void delete(Long id) {
    boolean exists = repository.existsById(id);
    if (!exists) {
      throw new IllegalStateException("Rooms with ID: " + id + " does not exist!");
    }
    System.out.print("Room Deleted!");
    repository.deleteById(id);
  }
}
//numnerOfStudents