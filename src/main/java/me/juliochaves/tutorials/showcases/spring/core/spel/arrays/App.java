package me.juliochaves.tutorials.showcases.spring.core.spel.arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		
		int[] numbers1 = (int[]) parser.parseExpression("new int[4]").getValue(int[].class);
		LOGGER.info("Int array with four positions: ");
		StringBuilder strNumbers1 = new StringBuilder();
		for (int i = 0; i < numbers1.length; i++) {
			strNumbers1.append("[" + numbers1[i] + "]");
		}
		LOGGER.info(strNumbers1.toString());
		// Array with initializer
		int[] numbers2 = (int[]) parser.parseExpression("new int[]{1,2,3}").getValue(int[].class);
		LOGGER.info("Int array with three elements: ");
		StringBuilder strNumbers2 = new StringBuilder();
		for (int i = 0; i < numbers2.length; i++) {
			strNumbers2.append("[" + numbers2[i] + "]");
		}
		LOGGER.info(strNumbers2.toString());
		// Multi dimensional array
		int[][] numbers3 = (int[][]) parser.parseExpression("new int[4][5]").getValue(int[][].class);
		LOGGER.info("Int matrix with 4 rows and 5 columns: ");
		StringBuilder strNumbers3 = new StringBuilder();
		for (int i = 0; i < numbers3.length; i++) {
			if(i > 0)
				strNumbers3.append("\t\t\t\t\t\t\t\t");
			else
				strNumbers3.append("\t");
			for (int j = 0; j < numbers3[i].length; j++) {
				strNumbers3.append("[" + numbers3[i][j] + "]");				
			}
			strNumbers3.append("\n");
		}
		LOGGER.info(strNumbers3.toString());
	}
}
