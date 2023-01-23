package me.juliochaves.tutorials.showcases.spring.core.spel.safenavigationoperator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Inventor;
import me.juliochaves.tutorials.showcases.spring.core.spel.beans.PlaceOfBirth;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		Inventor tesla = new Inventor("Nikola Tesla", "Serbian");
		tesla.setPlaceOfBirth(new PlaceOfBirth("Smiljan"));

		StandardEvaluationContext context = new StandardEvaluationContext(tesla);

		String city = parser.parseExpression("PlaceOfBirth?.City").getValue(context, String.class);
		
		LOGGER.info("Nikola Tesla's place of birth: " + city); // Smiljan

		tesla.setPlaceOfBirth(null);

		city = parser.parseExpression("PlaceOfBirth?.City").getValue(context, String.class);

		LOGGER.info("Nikola Tesla's place of birth (after setting the PoB to null): " + city); // null - does not throw NullPointerException!!!
		
		city = parser.parseExpression("PlaceOfBirth?.City ?: 'Unknown'").getValue(context, String.class);
		
		LOGGER.info("Nikola Tesla's place of birth (after setting the PoB to null and using elvis to put a default 'Unknown' value): " + city);
	}
}
