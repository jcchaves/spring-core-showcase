package me.juliochaves.tutorials.showcases.spring.core.spel.beanref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.AccessException;
import org.springframework.expression.BeanResolver;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Inventor;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext();
		context.setBeanResolver(new BeanResolver() {

			@Override
			public Object resolve(EvaluationContext context, String beanName)
					throws AccessException {
				if ("einstein".equals(beanName))
					return new Inventor("", "");
				else
					return null;
			}
		});

		Object bean = parser.parseExpression("@einstein").getValue(context);
		LOGGER.info("Bean retrieved with reference @einstein: " + bean);
	}
}
