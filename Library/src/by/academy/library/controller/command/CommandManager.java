package by.academy.library.controller.command;

import by.academy.library.controller.command.impl.AddNewBook;
import by.academy.library.controller.command.impl.DefaultCommand;
import by.academy.library.controller.command.impl.FindBookByTitle;
import by.academy.library.controller.command.impl.ViewAuthorCatalogCommand;
import by.academy.library.controller.command.impl.ViewBookCatalogCommand;

import static by.academy.library.controller.util.ControllerConstantStorage.*;

public class CommandManager {
	private static BasicCommand command = new DefaultCommand();

	public static BasicCommand defineCommand(String action) {
		switch (action) {
		case COMMAND_LIBRARY_VIEW:
			command = new ViewBookCatalogCommand();
			break;
		case COMMAND_AUTHOR_VIEW:
			command = new ViewAuthorCatalogCommand();
			break;
		case COMMAND_FIND_BOOK:
			command = new FindBookByTitle();
			break;
		case COMMAND_ADD_BOOK:
			command = new AddNewBook();
			break;
		}
		return command;
	}

}
