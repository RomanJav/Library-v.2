package by.academy.library.dao.collection;

import java.util.List;

import by.academy.library.dao.LibraryDao;
import by.academy.library.ds.Library;
import by.academy.library.entity.Author;
import by.academy.library.entity.Book;

public class LibraryDaoCollectionImple implements LibraryDao {
	private Library library;

	public LibraryDaoCollectionImple(Library library) {
		this.library = library;
	}
	
	@Override
	public List<Book> getBooks() {
		return library.getBooks();
	}

	@Override
	public List<Author> getAuthors() {
		return library.getAuthors();
	}

	@Override
	public void addBook(String author, String title) {
		library.addNewBook(author, title);
		
	}
	

}
