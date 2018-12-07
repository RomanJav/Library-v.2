package by.academy.library.dao.db;

import java.util.ArrayList;
import java.util.List;

import by.academy.library.dao.LibraryDao;
import by.academy.library.entity.Author;
import by.academy.library.entity.Book;

import java.sql.*;

public class LibraryDaoSQLImpl implements LibraryDao {

	private static final String url = "jdbc:mysql://localhost/library?serverTimezone=Europe/Moscow&useSSL=false";
	private static final String username = "root";
	private static final String password = "JJabramsloh1";

	@Override
	public List<Book> getBooks() {
		List<Book> books=new ArrayList<Book>();
		try {
			try (Connection conn = DriverManager.getConnection(url, username, password)) {

				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM library.book");
				while (resultSet.next()) {
					books.add(new Book(resultSet.getInt(1), resultSet.getString(2)));
				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return books;
	}

	@Override
	public List<Author> getAuthors() {
		List<Author> authors=new ArrayList<Author>();
		try {
			try (Connection conn = DriverManager.getConnection(url, username, password)) {

				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM library.author");
				while (resultSet.next()) {
					authors.add(new Author(resultSet.getString(2)));
				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return authors;
	}

	@Override
	public void addBook(String author, String title) {
		try {
			try (Connection conn = DriverManager.getConnection(url, username, password)) {

				Statement statement = conn.createStatement();
				statement.executeUpdate("INSERT INTO author(name) VALUES ('"+author+"')");
				statement.executeUpdate("INSERT INTO book(title) VALUES ('"+title+"')");
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
