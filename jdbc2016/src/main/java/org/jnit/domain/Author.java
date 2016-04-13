package org.jnit.domain;

import java.io.Serializable;
import java.util.*;

public class Author implements Serializable{

	
private static final long serialVersionUID = 1L;
	
	private int authorId;
	private String name;
	private String city;
	private String street;
	
	private List<Books> books = new ArrayList();


	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
}
