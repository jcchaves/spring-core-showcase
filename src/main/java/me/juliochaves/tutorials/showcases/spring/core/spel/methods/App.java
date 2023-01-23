package me.juliochaves.tutorials.showcases.spring.core.spel.methods;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;


import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Society;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);
	
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		// string literal, evaluates to "bc"
		String c = parser.parseExpression("'abc'.substring(2, 3)").getValue(
				String.class);
		
		LOGGER.info("Invoking method substring on 'abc' ('abc'.substring(2, 3)): " + c);
		
		Society ieee = new Society();

		StandardEvaluationContext societyContext = new StandardEvaluationContext(ieee);

		// evaluates to true
		boolean isMember = parser.parseExpression("isMember('Mihajlo Pupin')")
				.getValue(societyContext, Boolean.class);
		
		LOGGER.info("Evaluate if Mihajlo Pupin is member of the IEEE society (isMember('Mihajlo Pupin')): " + isMember);
	}
}
