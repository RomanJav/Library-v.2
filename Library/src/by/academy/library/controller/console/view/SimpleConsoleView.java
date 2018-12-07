package by.academy.library.controller.console.view;

import static by.academy.library.controller.util.ControllerConstantStorage.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleConsoleView {
	private static Map<String, Object> userInput = new HashMap<>();

	public static void showBasicMenu() {
		System.out.println("1 - view books catalog");
		System.out.println("2 - view authors catalog");
		System.out.println("3 - find book by title");
		System.out.println("4 - add new book");
	}

	public static Map<String, Object> readUserInput() {
		int item = readMenuItem();
		getInputData(item);
		
		return userInput;
	}

	private static void getInputData(int menuItem) {
		switch (menuItem) {
		case 1:
			userInput.put("user_action", COMMAND_LIBRARY_VIEW);
			break;
		case 2:
			userInput.put("user_action", COMMAND_AUTHOR_VIEW);
			break;
		case 3:
			userInput.put("user_action", COMMAND_FIND_BOOK);
			userInput.put("book_title", readStringItem());
			break;
		case 4:
			userInput.put("user_action", COMMAND_ADD_BOOK);
			userInput.put("author_name", readStringItem());
			userInput.put("book_title", readStringItem());
			break;
		default:
			break;
		}
	}

	private static int readMenuItem() {
		Scanner sc=new Scanner(System.in);
		int userInput=sc.nextInt();
		return userInput;
	}
	
	private static String readStringItem() {
		Scanner sc=new Scanner(System.in);
		String userInput=sc.nextLine();
		return userInput;
	}
}
