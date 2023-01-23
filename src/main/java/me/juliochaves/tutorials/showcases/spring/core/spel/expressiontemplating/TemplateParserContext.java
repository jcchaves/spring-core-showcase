package me.juliochaves.tutorials.showcases.spring.core.spel.expressiontemplating;

import org.springframework.expression.ParserContext;

public class TemplateParserContext implements ParserContext {
	@Override
	public String getExpressionPrefix() {
		return "#{";
	}

	@Override
	public String getExpressionSuffix() {
		return "}";
	}

	@Override
	public boolean isTemplate() {
		return true;
	}
}
