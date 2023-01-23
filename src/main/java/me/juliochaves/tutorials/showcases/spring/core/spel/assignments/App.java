package me.juliochaves.tutorials.showcases.spring.core.spel.assignments;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Inventor;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		Inventor inventor = new Inventor();
		StandardEvaluationContext inventorContext = new StandardEvaluationContext(
				inventor);

		parser.parseExpression("Name").setValue(inventorContext,
				"Alexander Seovic2");
		
		LOGGER.info("Inventor name after first set (Name = Alexander Seovic2): " + inventor.getName());
		
		// alternatively

		String aleks = parser.parseExpression("Name = 'Alexandar Seovic'")
				.getValue(inventorContext, String.class);
		
		LOGGER.info("Inventor name after second set (Name = Alexander Seovic): " + inventor.getName());
	}
}
