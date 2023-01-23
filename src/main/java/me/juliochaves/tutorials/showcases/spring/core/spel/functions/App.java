package me.juliochaves.tutorials.showcases.spring.core.spel.functions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext();
		try {
			context.registerFunction("reverseString", StringUtils.class
					.getDeclaredMethod("reverseString",
							new Class[] { String.class }));

			String helloWorldReversed = parser.parseExpression(
					"#reverseString('Hello World')").getValue(context,
					String.class);
			LOGGER.info("Reversed 'Hello World' using the reverseString function from StringUtils: '"
					+ helloWorldReversed + "'");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
