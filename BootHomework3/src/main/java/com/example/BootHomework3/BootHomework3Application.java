package com.example.BootHomework3;

import java.sql.Date;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.BootHomework3.beans.Cinema;
import com.example.BootHomework3.beans.Director;
import com.example.BootHomework3.beans.GenreType;
import com.example.BootHomework3.beans.Movie;
import com.example.BootHomework3.facade.ManagerFacade;

@SpringBootApplication
public class BootHomework3Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(BootHomework3Application.class, args)) {
			
			ManagerFacade manager = ctx.getBean(ManagerFacade.class);
			
//			manager.addDirector(new Director("testy", 25));
//			
//			Director dir = manager.getOneDirector(2);
//			
//			manager.addMovie(new Movie("movie 5", GenreType.ACTION, 90, Date.valueOf("2020-01-01"), dir));
//			manager.addMovie(new Movie("movie 6", GenreType.COMEDY, 100, Date.valueOf("2020-05-10"), dir));
//			manager.addMovie(new Movie("movie 7", GenreType.HORROR, 30, Date.valueOf("2020-08-30"), dir));
//			manager.addMovie(new Movie("movie 8", GenreType.WESTERN, 120, Date.valueOf("2021-01-01"), dir));
//			
			HashSet<Movie> movies = new HashSet<Movie>();
//			
//			movies.add(manager.getOneMovie(5));
//			movies.add(manager.getOneMovie(6));
//			movies.add(manager.getOneMovie(7));
//			movies.add(manager.getOneMovie(8));
//			Cinema cin = manager.getOneCinema(2);
//			cin.setMovies(movies);
//			manager.addCinema(cin);
			
			manager.deleteDirector(2);
			
//			manager.deleteMovie(2);
			
			
			
		}
	}

}
