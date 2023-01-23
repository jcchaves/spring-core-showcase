package me.juliochaves.tutorials.showcases.spring.core.spel.collections.selection;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import me.juliochaves.tutorials.showcases.spring.core.AbstractAppWithLog4jSupport;
import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Inventor;
import me.juliochaves.tutorials.showcases.spring.core.spel.beans.PlaceOfBirth;
import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Society;

public class App extends AbstractAppWithLog4jSupport {

	@Override
	protected void main() {
		ExpressionParser parser = new SpelExpressionParser();
		GregorianCalendar c = new GregorianCalendar();
		c.set(1856, 6, 10);
		Inventor nikolaTesla = new Inventor("Nikola Tesla", c.getTime(),
				"Serbian");

		PlaceOfBirth teslaPob = new PlaceOfBirth("Smijan");
		nikolaTesla.setPlaceOfBirth(teslaPob);

		String[] teslaInventions = new String[] { "Alternating current",
				"Light", "X-Rays", "Radio", "Remote control",
				"Induction motor", "Robotics", "Laser",
				"Wireless communication" };
		nikolaTesla.setInventions(teslaInventions);

		StandardEvaluationContext teslaContext = new StandardEvaluationContext(
				nikolaTesla);

		Society ieee = new Society();

		ieee.getMembers().add(nikolaTesla);

		StandardEvaluationContext societyContext = new StandardEvaluationContext(
				ieee);

		List<Inventor> serbianInventors= (List<Inventor>) parser.parseExpression("Members.?[Nationality == 'Serbian']").getValue(societyContext);

		logInfo("Serbian inventors (Members.?[Nationality == 'Serbian']) = " + serbianInventors);
		
		Map<String, Integer> numbersMap = new HashMap<String, Integer>();
		
		numbersMap.put("One", 1);
		numbersMap.put("Two", 2);
		numbersMap.put("Three", 3);
		numbersMap.put("Four", 4);
		numbersMap.put("Five", 5);
		numbersMap.put("Six", 6);
		numbersMap.put("Seven", 7);
		numbersMap.put("Eight", 8);
		societyContext.setVariable("numbersMap", numbersMap);
		
		Map<String, Integer> lessThanFiveMap = parser.parseExpression("#numbersMap.?[value < 5]").getValue(societyContext, Map.class);
		
		logInfo("A map with numbers that are less than the number five: " + lessThanFiveMap);
		
		List<String> stringsList = new ArrayList<String>();
		
		stringsList.add("First element");
		stringsList.add("Second element");
		stringsList.add("Last element");
		
		societyContext.setVariable("stringsList", stringsList);
		
		String firstElement = parser.parseExpression("#stringsList.^[#this.contains('element')]").getValue(societyContext, String.class);
		
		logInfo("The first element of a string list: " + firstElement);
		
		String lastElement = parser.parseExpression("#stringsList.$[#this.contains('element')]").getValue(societyContext, String.class);
		
		logInfo("The last element of a string list: " + lastElement);
		
		String stringsProjection = parser.parseExpression("#stringsList.![#this.toUpperCase()]").getValue(societyContext, String.class);
		
		logInfo("The last element of a string list: " + stringsProjection);
	}

	public static void main(String[] args) {
		new App().main();
	}
}