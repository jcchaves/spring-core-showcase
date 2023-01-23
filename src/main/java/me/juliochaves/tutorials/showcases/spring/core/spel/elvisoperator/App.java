package me.juliochaves.tutorials.showcases.spring.core.spel.elvisoperator;

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
		
		String name = parser.parseExpression("null?:'Unknown'").getValue(String.class);
		
		LOGGER.info("Name (null?:'Unknown') = " + name);
		
		Inventor tesla = new Inventor("Nikola Tesla", "Serbian");
		
		StandardEvaluationContext context = new StandardEvaluationContext(tesla);

		String teslaName = parser.parseExpression("Name?:'Elvis Presley'").getValue(context, String.class);

		LOGGER.info(teslaName); // Nikola Tesla

		tesla.setName(null);

		teslaName = parser.parseExpression("Name?:'Elvis Presley'").getValue(context, String.class);

		LOGGER.info(teslaName); // Elvis Presley
	}
}
