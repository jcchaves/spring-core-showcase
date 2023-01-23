package me.juliochaves.tutorials.showcases.spring.core.spel.operators.mathematical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);
	
	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		
		// Addition
		int onePlusOne = parser.parseExpression("1 + 1").getValue(Integer.class); // 2
		
		LOGGER.info("Solve: 1 + 1 = " + onePlusOne);
		
		String testConcatString =
		   parser.parseExpression("'test' + ' ' + 'string'").getValue(String.class);  // 'test string'
		
		LOGGER.info("'test' + ' ' + 'string' = " + testConcatString);
		
		// Subtraction
		int oneMinusMinusThree =  parser.parseExpression("1 - -3").getValue(Integer.class); // 4
		
		LOGGER.info("Solve: 1 - -3 = " + oneMinusMinusThree);
		
		double thousandMinusTenThousand = parser.parseExpression("1000.00 - 1e4").getValue(Double.class); // -9000
		
		LOGGER.info("Solve: 1000.00 - 1e4 = " + thousandMinusTenThousand);
		
		// Multiplication
		int minusTwoByMinusThree =  parser.parseExpression("-2 * -3").getValue(Integer.class); // 6
		
		LOGGER.info("Solve: -2 * -3 = " + minusTwoByMinusThree);
		
		double twoByThreeByFour = parser.parseExpression("2.0 * 3e0 * 4").getValue(Double.class); // 24.0
		
		LOGGER.info("Solve: 2.0 * 3e0 * 4 = " + twoByThreeByFour);
		
		// Division
		int sixDivMinusThree =  parser.parseExpression("6 / -3").getValue(Integer.class); // -2
		
		LOGGER.info("Solve: 6 / -3 = " + sixDivMinusThree);
		
		double eightDivFourDivTwo = parser.parseExpression("8.0 / 4e0 / 2").getValue(Double.class); // 1.0
		
		LOGGER.info("Solve: 8.0 / 4e0 / 2 = " + eightDivFourDivTwo);
		
		// Modulus
		int sevenModFour =  parser.parseExpression("7 % 4").getValue(Integer.class); // 3
		
		LOGGER.info("Solve: 7 % 4 = " + sevenModFour);
		
		int eightDivFiveModTwo = parser.parseExpression("8 / 5 % 2").getValue(Integer.class); // 1
		
		LOGGER.info("Solve: 8 / 5 % 2 = " + eightDivFiveModTwo);
		
		// Operator precedence
		int onePlusTwoMinusThreeByEight = parser.parseExpression("1+2-3*8").getValue(Integer.class); // -21
		
		LOGGER.info("Solve: 1 + 2 - 3 * 8 = " + onePlusTwoMinusThreeByEight);
	}
}
