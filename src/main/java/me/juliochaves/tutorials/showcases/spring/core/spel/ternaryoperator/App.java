package me.juliochaves.tutorials.showcases.spring.core.spel.ternaryoperator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Society;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);
	
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		
		String falseString = parser.parseExpression("false ? 'trueExp' : 'falseExp'").getValue(String.class);
		
		LOGGER.info("False String evaluated with the ternary operator: " + falseString);
		
		Society ieee = new Society();
		
		StandardEvaluationContext societyContext = new StandardEvaluationContext(ieee);
		
		parser.parseExpression("Name").setValue(societyContext, "IEEE");
		
		LOGGER.info("Society name: " + ieee.getName());
		
		societyContext.setVariable("queryName", "Nikola Tesla");
		
		String expression = "isMember(#queryName) ? #queryName + ' is a member of the ' " +
							" + Name + ' Society' : #queryName + ' is not a member of the ' " +
							" + Name + ' Society'";
		
		String queryResultString = parser.parseExpression(expression).getValue(societyContext, String.class);
		
		LOGGER.info("queryResultString = " + queryResultString);
	}
}
