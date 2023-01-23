package me.juliochaves.tutorials.showcases.spring.core.spel.operators.logical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Inventor;
import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Society;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);
	
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		
		Society ieee = new Society();
		
		Inventor nikolaTesta = new Inventor();
		nikolaTesta.setName("Nikola Tesla");
		
		Inventor mihajloPupin = new Inventor();
		mihajloPupin.setName("Mihajlo Pupin");
		
		ieee.getMembers().add(nikolaTesta);
		ieee.getMembers().add(mihajloPupin);
		
		StandardEvaluationContext societyContext = new StandardEvaluationContext(ieee);
		
		// -- AND --

		// evaluates to false
		boolean trueAndFalse = parser.parseExpression("true and false").getValue(Boolean.class);
		
		LOGGER.info("true AND false ? " + trueAndFalse);
		
		// evaluates to true
		String teslaAndPupinMembers =  "isMember('Nikola Tesla') and isMember('Mihajlo Pupin')";
		boolean areTeslaAndPupinMembers = parser.parseExpression(teslaAndPupinMembers).getValue(societyContext, Boolean.class);
		
		LOGGER.info("Are Tesla and Pupin members ? " + areTeslaAndPupinMembers);
		
		// -- OR --

		// evaluates to true
		boolean trueOrFalse = parser.parseExpression("true or false").getValue(Boolean.class);
		
		LOGGER.info("true OR false ? " + trueOrFalse);
		
		// evaluates to true
		String teslaOrEinsteinMembers =  "isMember('Nikola Tesla') or isMember('Albert Einstein')";
		boolean areTeslaOrEinsteinMembers = parser.parseExpression(teslaOrEinsteinMembers).getValue(societyContext, Boolean.class);
		
		LOGGER.info("Are Tesla or Einstein members ? " + areTeslaOrEinsteinMembers);
		// -- NOT --

		// evaluates to false
		boolean notTrue = parser.parseExpression("!true").getValue(Boolean.class);
		
		LOGGER.info("NOT true " + notTrue);

		// -- AND and NOT --
		String teslaMemberAndPupinNotMember =  "isMember('Nikola Tesla') and !isMember('Mihajlo Pupin')";
		boolean isTeslaMemberAndPupinNotMember = parser.parseExpression(teslaMemberAndPupinNotMember).getValue(societyContext, Boolean.class);
		
		LOGGER.info("Is Tesla a member and Pupin not ? " + isTeslaMemberAndPupinNotMember);
	}
}
