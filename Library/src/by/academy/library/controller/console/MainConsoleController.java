package by.academy.library.controller.console;

import static by.academy.library.controller.console.view.SimpleConsoleView.*;

import java.util.Map;

import static by.academy.library.controller.command.CommandManager.*;

import by.academy.library.controller.command.BasicCommand;
import by.academy.library.controller.console.view.CommandOutputResult;
import by.academy.library.ds.Library;

public class MainConsoleController {

	public static void main(String[] args) {
		Library library = new Library();
		while (true) {
			showBasicMenu();
			Map<String, Object> userData = readUserInput();
			Object userAction = userData.get("user_action");
			BasicCommand command = defineCommand(convertString(userAction));
			CommandOutputResult.printResult(command.performAction(library, userData));
		}
	}

	private static String convertString(Object obj) {

		return (String) obj;
	}

}
