package com.example.BootHomework3.db;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.BootHomework3.beans.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Integer> {

	List<Cinema> findCinemasByCity(String city);
	
	
	@Modifying
	@Query(value = "DELETE FROM cinemas_showings WHERE cinema_id = :cinemaId", nativeQuery = true)
	void deleteCinemaShowings(int cinemaId);
}
