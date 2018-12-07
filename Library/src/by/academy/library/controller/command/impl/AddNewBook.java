package by.academy.library.controller.command.impl;

import java.util.Map;
import by.academy.library.controller.command.BasicCommand;
import by.academy.library.ds.Library;
import by.academy.library.service.CatalogService;
import by.academy.library.service.impl.RegularCatalogServiceImpl;

public class AddNewBook  implements BasicCommand {
	private CatalogService catalogService;

	@Override
	public String performAction(Library library, Map<String, Object> params) {
		catalogService = new RegularCatalogServiceImpl(library);
		catalogService.addBook((String)params.get("author_name"), (String)params.get("book_title"));
		return ("Added item :"+"author - "+(String)params.get("author_name")+" whis title - "+(String)params.get("book_title"));
	}
}
