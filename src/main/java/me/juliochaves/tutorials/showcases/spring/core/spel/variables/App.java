package me.juliochaves.tutorials.showcases.spring.core.spel.variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

		Inventor tesla = new Inventor("Nikola Tesla", "Serbian");

		StandardEvaluationContext context = new StandardEvaluationContext(tesla);
		context.setVariable("newName", "Mike Tesla");

		LOGGER.info("Tesla name before property set with variable reference #newName: " + tesla.getName()); // "Nikola Tesla"

		parser.parseExpression("Name = #newName").getValue(context);

		LOGGER.info("Tesla name after property set with variable reference #newName: " + tesla.getName()); // "Mike Tesla"
		
		// #this and #root
		
		// create an array of integers
		List<Integer> primes = new ArrayList<Integer>();
		primes.addAll(Arrays.asList(2,3,5,7,11,13,17));

		context.setVariable("primes",primes);

		// all prime numbers > 10 from the list (using selection ?{...})
		// evaluates to [11, 13, 17]
		List<Integer> primesGreaterThanTen =
		             (List<Integer>) parser.parseExpression("#primes.?[#this>10]").getValue(context);
		
		LOGGER.info("Prime numbers greater than ten in list [2, 3, 5, 7, 11, 13, 17]: " + primesGreaterThanTen);
		
	}
}
