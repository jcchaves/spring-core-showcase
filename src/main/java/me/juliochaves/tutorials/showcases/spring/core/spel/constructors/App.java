package me.juliochaves.tutorials.showcases.spring.core.spel.constructors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Inventor;
import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Society;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		Inventor einstein = parser
				.parseExpression(
						"new com.spring.tutorial.spel.beans.Inventor('Albert Einstein', 'German')")
				.getValue(Inventor.class);
		
		LOGGER.info("Inventor name and nationality: " + einstein.getName() + " - " + einstein.getNationality());
		
		Society ieee = new Society();

		StandardEvaluationContext societyContext = new StandardEvaluationContext(
				ieee);

		// create new inventor instance within add method of List
		parser.parseExpression(
				"Members.add(new com.spring.tutorial.spel.beans.Inventor('Albert Einstein', 'German'))")
				.getValue(societyContext);
		
		Inventor inventor = (Inventor) ieee.getMembers().get(0);
		
		LOGGER.info("Member name and nationality: " + inventor.getName() + " - " + inventor.getNationality());

	}
}
