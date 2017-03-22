package com.example.repository;

import com.example.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
  /**
   * Dynamic Query Generation in Spring
   * Use the name convention in Spring Data
   */
  Room findByNumber(String number);
}
