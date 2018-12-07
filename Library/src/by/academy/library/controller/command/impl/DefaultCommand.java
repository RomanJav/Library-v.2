package by.academy.library.controller.command.impl;

import java.util.Map;

import by.academy.library.controller.command.BasicCommand;
import by.academy.library.ds.Library;

public class DefaultCommand implements BasicCommand{

	@Override
	public String performAction(Library library, Map<String, Object> params) {
		return "Incorrect user input";
		
	}

}
