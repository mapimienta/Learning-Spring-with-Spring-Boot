package com.example.controller;

import com.example.entity.Room;
import com.example.repository.RoomRepository;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RoomController {
  @Autowired
  private RoomRepository _repository;

  @GetMapping("/room")
  public Room findRoom(@RequestParam(value = "number", defaultValue = "P1") String number){
    Room room = _repository.findByNumber(number);
    return room;
  }

  @GetMapping("/allrooms")
  public Iterable<Room> allRooms(){
    return _repository.findAll();
  }
}
