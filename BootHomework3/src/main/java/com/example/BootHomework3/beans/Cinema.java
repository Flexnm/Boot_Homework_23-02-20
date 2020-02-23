package com.example.BootHomework3.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cinemas")
public class Cinema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String city;
	@Column
	private int numberOfScreens;
	@ManyToMany
	@JoinTable(name = "cinemas_showings", joinColumns = @JoinColumn(name = "cinema_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"))
	private Set<Movie> movies;
	
	public Cinema() {
		
	}
	
	public Cinema(String name, String city, int numberOfScreens, Set<Movie> movies) {
		setName(name);
		setCity(city);
		setNumberOfScreens(numberOfScreens);
		setMovies(movies);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public int getNumberOfScreens() {
		return numberOfScreens;
	}
	
	public Set<Movie> getMovies(){
		return movies;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setNumberOfScreens(int numberOfScreens) {
		this.numberOfScreens = numberOfScreens;
	}
	
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	
	public String toString() {
		return name;
	}

}
