package me.juliochaves.tutorials.showcases.spring.core.binding.beanwrapper;

import me.juliochaves.tutorials.showcases.spring.core.binding.beanwrapper.beans.Bar;
import me.juliochaves.tutorials.showcases.spring.core.binding.beanwrapper.beans.Foo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		BeanWrapper bar = new BeanWrapperImpl(new Bar());
		// setting the bar kind...
		bar.setPropertyValue("kind", "Extreme");
		// ... can also be done like this:
		PropertyValue value = new PropertyValue("kind", "Extreme");
		bar.setPropertyValue(value);

		// create the foo instance an pass it the bar instance
		BeanWrapper foo = new BeanWrapperImpl(new Foo());
		foo.setPropertyValue("bar", bar.getWrappedInstance());

		// retrieving the bar property through the foo instance
		Bar fooBar = (Bar) foo.getPropertyValue("bar");
		String barKind = (String) foo.getPropertyValue("bar.kind");
		LOGGER.info("Foo.bar = " + fooBar);
		LOGGER.info("Foo.bar.kind = " + barKind);
	}
}
