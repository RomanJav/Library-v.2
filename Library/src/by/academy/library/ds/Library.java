package by.academy.library.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.academy.library.entity.Author;
import by.academy.library.entity.Book;

public class Library {
	private Map<Author, Book> library;

	public Library() {
		this.setLibrary(new HashMap<Author, Book>());
	}

	public Map<Author, Book> getLibrary() {
		return library;
	}

	private void setLibrary(Map<Author, Book> library) {
		library.put(new Author("Joe Montana"), new Book(1, "How to meet friends"));
		library.put(new Author("Jack Boe"), new Book(2, "Perseption"));
		library.put(new Author("Yuriy Pochar"), new Book(3, "Lui"));
		library.put(new Author("Cate Adson"), new Book(4, "We are warriors"));
		this.library = library;
	}

	public void addNewBook(String author, String book) {
		this.library.put(new Author(author), new Book(getBooks().size()+1, book));
	}

	public List<Book> getBooks(){
		List<Book> books=new ArrayList<Book>(library.values());
		return books;
	}
	public List<Author> getAuthors(){	
		List<Author> authors=new ArrayList<Author>(library.keySet());
		return authors;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((library == null) ? 0 : library.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (library == null) {
			if (other.library != null)
				return false;
		} else if (!library.equals(other.library))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Library [library=" + library + "]";
	}

}
