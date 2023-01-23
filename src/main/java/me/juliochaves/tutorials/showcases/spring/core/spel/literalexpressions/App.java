package me.juliochaves.tutorials.showcases.spring.core.spel.literalexpressions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		String helloWorldExpression = (String) parser.parseExpression("'Hello World'").getValue();
		LOGGER.info("String expression ('Hello World'): " + helloWorldExpression);
		double avogadrosNumber = (Double) parser.parseExpression("6.0221415E+23").getValue();
		LOGGER.info("Double expression (6.0221415E+23): " + avogadrosNumber);
		int maxValue = (Integer) parser.parseExpression("0x7FFFFFFF").getValue();
		LOGGER.info("Integer expression (0x7FFFFFFF):" + maxValue);
		boolean trueValue = (Boolean) parser.parseExpression("true").getValue();
		LOGGER.info("Boolean expression (true): " + trueValue);
		Object nullValue = parser.parseExpression("null").getValue();
		LOGGER.info("Null value expression (null): " + nullValue);
	}
}
