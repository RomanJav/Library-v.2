package by.academy.library.controller.command;

import java.util.Map;

import by.academy.library.ds.Library;

public interface BasicCommand {
	String performAction(Library library, Map<String, Object> params);
}
