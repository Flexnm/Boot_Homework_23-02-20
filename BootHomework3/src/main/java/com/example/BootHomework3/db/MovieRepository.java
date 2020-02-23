package com.example.BootHomework3.db;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.BootHomework3.beans.GenreType;
import com.example.BootHomework3.beans.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	List<Movie> findMoviesByDirectorId(int directorId);
	
	List<Movie> findMoviesByGenre(GenreType genre);
	
	List<Movie> findMoviesByShowTime(Date showTime);
	
	List<Movie> findMoviesByShowTimeBetween(Date showTime, Date otherTime);
	
	void deleteMoviesByDirectorId(int directorId);
	
	@Modifying
	@Query(value = "DELETE FROM cinemas_showings WHERE movie_id = :movieId", nativeQuery = true)
	void deleteMovieShowings(int movieId);


}
