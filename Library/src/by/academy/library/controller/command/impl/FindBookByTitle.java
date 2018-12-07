package by.academy.library.controller.command.impl;

import java.util.List;
import java.util.Map;

import by.academy.library.controller.command.BasicCommand;
import by.academy.library.ds.Library;
import by.academy.library.entity.Book;
import by.academy.library.service.CatalogService;
import by.academy.library.service.impl.RegularCatalogServiceImpl;

public class FindBookByTitle  implements BasicCommand {
	private CatalogService catalogService;

	@Override
	public String performAction(Library library, Map<String, Object> params) {
		catalogService = new RegularCatalogServiceImpl(library);
		List<Book> books = catalogService.listBooks();
		Book book = null;
		for (Book book2 : books) {
			if(book2.getTitle().equals(params.get("book_title"))) {
				book=book2;
			}
		}
		return book.toString();
	}
}
