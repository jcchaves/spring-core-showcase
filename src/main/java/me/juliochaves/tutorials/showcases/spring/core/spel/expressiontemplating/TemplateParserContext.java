package me.juliochaves.tutorials.showcases.spring.core.spel.expressiontemplating;

import org.springframework.expression.ParserContext;
import org.springframework.lang.NonNull;

public class TemplateParserContext implements ParserContext {
	@Override
	public @NonNull String getExpressionPrefix() {
		return "#{";
	}

	@Override
	public @NonNull String getExpressionSuffix() {
		return "}";
	}

	@Override
	public boolean isTemplate() {
		return true;
	}
}
