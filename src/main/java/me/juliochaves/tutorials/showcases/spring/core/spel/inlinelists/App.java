package me.juliochaves.tutorials.showcases.spring.core.spel.inlinelists;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		List numbers = parser.parseExpression("{1, 2, 3, 4}").getValue(List.class);

		LOGGER.info("List of numbers: " + numbers);
		
		List<List> listOfLists = (List) parser.parseExpression("{{'a','b'},{'x','y'}}").getValue(List.class);
		
		LOGGER.info("List of lists: " + listOfLists);
	}
}
