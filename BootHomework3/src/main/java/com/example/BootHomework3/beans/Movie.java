package com.example.BootHomework3.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String title;
	@Column
	private GenreType genre;
	@Column
	private int duration; // minutes
	@Column
	private Date showTime;
	@ManyToOne
	private Director director;
	
	public Movie() {
		
	}
	
	public Movie(String title, GenreType genre, int duration, Date showTime, Director director) {
		setTitle(title);
		setGenreType(genre);
		setDuration(duration);
		setShowTime(showTime);
		setDirector(director);
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public GenreType getGenreType() {
		return genre;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public Date getShowTime() {
		return showTime;
	}
	
	public Director getDirector() {
		return director;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setGenreType(GenreType genre) {
		this.genre = genre;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}
	
	public void setDirector(Director director) {
		this.director = director;
	}
	
	public String toString() {
		return title;
	}

}
