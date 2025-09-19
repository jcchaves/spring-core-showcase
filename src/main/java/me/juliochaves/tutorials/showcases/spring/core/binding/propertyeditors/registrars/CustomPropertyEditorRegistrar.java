package me.juliochaves.tutorials.showcases.spring.core.binding.propertyeditors.registrars;

import java.util.Date;

import me.juliochaves.tutorials.showcases.spring.core.binding.propertyeditors.editors.DateEditor;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import org.springframework.lang.NonNull;

public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(@NonNull PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Date.class, new DateEditor());
	}
}
