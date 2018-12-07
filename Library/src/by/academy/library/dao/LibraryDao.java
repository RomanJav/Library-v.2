package by.academy.library.dao;

import java.util.List;

import by.academy.library.ds.Library;
import by.academy.library.entity.Author;
import by.academy.library.entity.Book;

public interface LibraryDao {
	List<Book> getBooks();
	List<Author> getAuthors();

	void addBook(String author, String title);

}
