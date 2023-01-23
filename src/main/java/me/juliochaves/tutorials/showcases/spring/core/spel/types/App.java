package me.juliochaves.tutorials.showcases.spring.core.spel.types;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	
	private final static Log LOGGER = LogFactory.getLog(App.class);
	
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		
		Class dateClass = parser.parseExpression("T(java.util.Date)").getValue(Class.class);
		
		LOGGER.info("Date class: " + dateClass);
		
		Class stringClass = parser.parseExpression("T(String)").getValue(Class.class);
		
		LOGGER.info("String class: " + stringClass);
		
		boolean roundingModeCeilingIsLessThanRoundingModeFloor =
		   parser.parseExpression("T(java.math.RoundingMode).CEILING < T(java.math.RoundingMode).FLOOR")
		  .getValue(Boolean.class);
		
		LOGGER.info("java.util.RoundingMode.CEILING is less than java.util.RoundingMode.FLOOR ? " + roundingModeCeilingIsLessThanRoundingModeFloor);
	}
}
