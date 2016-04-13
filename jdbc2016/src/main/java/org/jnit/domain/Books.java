package org.jnit.domain;

public class Books {
	private int bookId;
	private String title;
	private String bookStatus;
	private int athorId;
	
	@Override
	public String toString() {
		return "Book [BooK Title=" + title + ", authorId=" +athorId + "]";
	}

	public int getAthorId() {
		return athorId;
	}

	public void setAthorId(int i) {
		this.athorId = i;
	}

	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	
}
