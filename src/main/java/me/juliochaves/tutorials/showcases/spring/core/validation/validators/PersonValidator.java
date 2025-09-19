package me.juliochaves.tutorials.showcases.spring.core.validation.validators;

import me.juliochaves.tutorials.showcases.spring.core.validation.beans.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import org.springframework.lang.NonNull;

public class PersonValidator implements Validator {
	@Override
	public boolean supports(@NonNull Class<?> clazz) {
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(@NonNull Object obj, @NonNull Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
		Person p = (Person) obj;
		if (p.getAge() < 0) {
			e.rejectValue("age", "negativevalue");
		} else if (p.getAge() > 110) {
			e.rejectValue("age", "too.darn.old");
		}
	}
}
