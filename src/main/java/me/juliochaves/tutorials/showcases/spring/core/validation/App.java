package me.juliochaves.tutorials.showcases.spring.core.validation;

import java.util.ArrayList;
import java.util.List;

import me.juliochaves.tutorials.showcases.spring.core.validation.beans.Person;
import me.juliochaves.tutorials.showcases.spring.core.validation.validators.PersonValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		Person invalidPerson = new Person();
		Validator personValidator = new PersonValidator();
		Errors errors = new BeanPropertyBindingResult(invalidPerson,
				"invalidPerson");
		personValidator.validate(invalidPerson, errors);
		LOGGER.info("Error count: " + errors.getErrorCount());
		for (ObjectError e : errors.getAllErrors()) {
			LOGGER.info(e);
		}

		Person tooOldPerson = new Person();

		DataBinder binder = new DataBinder(tooOldPerson);
		binder.setValidator(new PersonValidator());

		List<PropertyValue> propertyValuesList = new ArrayList<PropertyValue>();
		propertyValuesList.add(new PropertyValue("name", "John Doe"));
		propertyValuesList.add(new PropertyValue("age", 115));

		PropertyValues propertyValues = new MutablePropertyValues(
				propertyValuesList);

		binder.bind(propertyValues);

		// validate the target object
		binder.validate();

		// get BindingResult that includes any validation errors
		BindingResult results = binder.getBindingResult();

		LOGGER.info("Binding results: " + results);
	}
}
