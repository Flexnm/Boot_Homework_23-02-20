package com.example.BootHomework3.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "directors")
public class Director {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private int experience; // years
	@OneToMany(mappedBy = "director")
	private List<Movie> movies;
	
	public Director() {
		
	}
	
	public Director(String name, int experience) {
		setName(name);
		setExperience(experience);
		setMovies(movies);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public List<Movie> getMovies(){
		return movies;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	public String toString() {
		return name;
	}

}
