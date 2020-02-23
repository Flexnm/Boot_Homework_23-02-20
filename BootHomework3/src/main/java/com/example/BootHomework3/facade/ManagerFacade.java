package com.example.BootHomework3.facade;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BootHomework3.beans.Cinema;
import com.example.BootHomework3.beans.Director;
import com.example.BootHomework3.beans.GenreType;
import com.example.BootHomework3.beans.Movie;
import com.example.BootHomework3.db.CinemaRepository;
import com.example.BootHomework3.db.DirectorRepository;
import com.example.BootHomework3.db.MovieRepository;

@Transactional
@Service
public class ManagerFacade {

	@Autowired
	private MovieRepository movieDB;
	@Autowired
	private DirectorRepository directorDB;
	@Autowired
	private CinemaRepository cinemaDB;

	public ManagerFacade() {

	}

	public void addDirector(Director director) {
		directorDB.save(director);
	}

	public void addMovie(Movie movie) {
		movieDB.save(movie);
	}

	public void addCinema(Cinema cinema) {
		cinemaDB.save(cinema);
	}

	public void updateDirector(Director director) {
		if (directorDB.findById(director.getId()).isPresent()) {
			directorDB.save(director);
		}
	}

	public void updateMovie(Movie movie) {
		if (movieDB.findById(movie.getId()).isPresent()) {
			movieDB.save(movie);
		}
	}

	public void updateCinema(Cinema cinema) {
		if (cinemaDB.findById(cinema.getId()).isPresent()) {
			cinemaDB.save(cinema);
		}
	}

	public void deleteDirector(int id) {
		for (Movie movie : movieDB.findMoviesByDirectorId(id)) {
			movieDB.deleteMovieShowings(movie.getId());
		}
		movieDB.deleteMoviesByDirectorId(id);
		directorDB.deleteById(id);
	}

	public void deleteMovie(int id) {
		movieDB.deleteMovieShowings(id);
		movieDB.deleteById(id);
	}

	public void deleteCinema(int id) {
		cinemaDB.deleteCinemaShowings(id);
		cinemaDB.deleteById(id);
	}

	public List<Director> getAllDirectors() {
		return directorDB.findAll();
	}

	public List<Movie> getAllMovies() {
		return movieDB.findAll();
	}

	public List<Cinema> getAllCinemas() {
		return cinemaDB.findAll();
	}

	public Director getOneDirector(int id) {
		return directorDB.findById(id).orElse(null);
	}

	public Movie getOneMovie(int id) {
		return movieDB.findById(id).orElse(null);
	}

	public Cinema getOneCinema(int id) {
		return cinemaDB.findById(id).orElse(null);
	}

	public List<Movie> getMoviesByGenre(GenreType genre) {
		return movieDB.findMoviesByGenre(genre);
	}

	public List<Movie> getMoviesByDate(Date showTime) {
		return movieDB.findMoviesByShowTime(showTime);
	}

	public List<Movie> getMoviesBetweenShowtimes(Date showTime, Date otherTime) {
		return movieDB.findMoviesByShowTimeBetween(showTime, otherTime);
	}

	public List<Cinema> getCinemasByCity(String city) {
		return cinemaDB.findCinemasByCity(city);
	}

}
