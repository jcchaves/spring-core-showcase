package me.juliochaves.tutorials.showcases.spring.core.spel.propsandcolls;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Inventor;
import me.juliochaves.tutorials.showcases.spring.core.spel.beans.PlaceOfBirth;
import me.juliochaves.tutorials.showcases.spring.core.spel.beans.Society;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		GregorianCalendar c = new GregorianCalendar();
		c.set(1856, 6, 10);
		Inventor nikolaTesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");
		
		int year = (Integer) parser.parseExpression("Birthdate.Year + 1900").getValue(nikolaTesla);
		LOGGER.info("Nikola Tesla was born on " + year);
		
		PlaceOfBirth teslaPob = new PlaceOfBirth("Smijan");
		nikolaTesla.setPlaceOfBirth(teslaPob);
		
		String city = parser.parseExpression("placeOfBirth.City").getValue(nikolaTesla, String.class);
		LOGGER.info("Nikola Tesla was born in " + city);
		
		String[] teslaInventions = new String[]{ "Alternating current", "Light", "X-Rays", "Radio", "Remote control", "Induction motor", "Robotics", "Laser", "Wireless communication" };
		nikolaTesla.setInventions(teslaInventions);
		
		StandardEvaluationContext teslaContext = new StandardEvaluationContext(nikolaTesla);
		
		String invention = parser.parseExpression("inventions[3]").getValue(teslaContext, String.class);
		
		LOGGER.info("Nikola Tesla invention: " + invention);
		
		Society ieee = new Society();
		
		ieee.getMembers().add(nikolaTesla);
		
		StandardEvaluationContext societyContext = new StandardEvaluationContext(ieee);
		
		String name = parser.parseExpression("Members[0].Name").getValue(societyContext, String.class);
		
		LOGGER.info("IEEE first member: " + name);
		
		String anotherInvention = parser.parseExpression("Members[0].Inventions[6]").getValue(societyContext, String.class);
		
		LOGGER.info("IEEE first member invention: " + anotherInvention);
		
		c.set(1858, 7, 4);
		Inventor michaelPupin = new Inventor("Michael Pupin", c.getTime(), "Serbian");
		PlaceOfBirth pupinPob = new PlaceOfBirth("Idvor", "Serbia");
		
		michaelPupin.setPlaceOfBirth(pupinPob);
		
		ieee.getOfficers().put("president", michaelPupin);
		
		List<Inventor> advisors = new ArrayList<Inventor>();
		advisors.add(nikolaTesla);
		
		ieee.getOfficers().put("advisors", advisors);
		
		Inventor pupin = parser.parseExpression("Officers['president']").getValue(societyContext, Inventor.class);
		
		LOGGER.info("IEEE president: " + pupin.getName());
		
		String pupinCity = parser.parseExpression("Officers['president'].PlaceOfBirth.City").getValue(societyContext, String.class);
		
		LOGGER.info("IEEE president city: " + pupinCity);
		
		parser.parseExpression("Officers['advisors'][0].PlaceOfBirth.Country").setValue(societyContext, "Croatia");
		
		String teslaCountry = parser.parseExpression("Officers['advisors'][0].PlaceOfBirth.Country").getValue(societyContext, String.class);
		
		LOGGER.info("IEEE first advisor country: " + teslaCountry);
	}
}
