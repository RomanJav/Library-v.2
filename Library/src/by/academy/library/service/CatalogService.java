package by.academy.library.service;

import java.util.List;

import by.academy.library.ds.Library;
import by.academy.library.entity.Author;
import by.academy.library.entity.Book;

public interface CatalogService {

	List<Book> listBooks();
	List<Author> listAuthors();
	void addBook(String author, String title);

}
