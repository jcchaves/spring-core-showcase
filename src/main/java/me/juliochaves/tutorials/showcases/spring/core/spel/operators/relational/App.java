package me.juliochaves.tutorials.showcases.spring.core.spel.operators.relational;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);
	private final static ExpressionParser parser = new SpelExpressionParser();

	public static void main(String[] args) {
		
		boolean twoEqualsTwo = evaluateExpression("2 == 2", Boolean.class);
		
		LOGGER.info("Two equals two? " + twoEqualsTwo);
		
		boolean twoLessThanMinusFive = evaluateExpression("2 < -5.0", Boolean.class);
		
		LOGGER.info("Two is less than minus five? " + twoLessThanMinusFive);
		
		boolean blackBeforeBlock = evaluateExpression("'black' < 'block'", Boolean.class);
		
		LOGGER.info("'black' is lexicographically before 'block'? " + blackBeforeBlock);
		
		boolean stringInstanceOfObject = evaluateExpression("'xyz' instanceof T(int)", Boolean.class);
		
		LOGGER.info("'xyz' is an instance of Integer? " + stringInstanceOfObject);
		
		boolean regexMatch1 = evaluateExpression("'5.00' matches '^-?\\d+(\\.\\d{2})?$'", Boolean.class);
		
		LOGGER.info("'5.00' matches '^-?\\d+(\\.\\d{2})?$' ? " + regexMatch1);
		
		boolean regexMatch2 = evaluateExpression("'5.0067' matches '^-?\\d+(\\.\\d{2})?$'", Boolean.class);
		
		LOGGER.info("'5.0067' matches '^-?\\d+(\\.\\d{2})?$' ? " + regexMatch2);
	}

	static <T> T evaluateExpression(String expr, Class<T> clazz) {
		return parser.parseExpression(expr).getValue(clazz);
	}
}
