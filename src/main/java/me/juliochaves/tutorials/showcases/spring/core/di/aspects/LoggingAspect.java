package me.juliochaves.tutorials.showcases.spring.core.di.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	private final static Log LOGGER = LogFactory.getLog(LoggingAspect.class);

	@Pointcut("!within(com.spring.tutorial.di.aspects.*)")
	private void notWithinAspects() {
	}

	@Pointcut("initialization(*.new(..)) && within(com.spring.tutorial.di.constructorbased.beans.dependent.*)")
	private void fooConstructorCall() {
	}

	@Pointcut("initialization(*.new(..)) && within(com.spring.tutorial.di.cnamespace.beans.*)")
	private void fooCNamespaceConstructorCall() {
	}

	@Pointcut("execution(* createFoo(..)) && within(com.spring.tutorial.di.factorymethodbased.beans.dependent.*)")
	private void fooFactoryMethodCall() {
	}

	@Pointcut("execution(* set*(..)) && args(obj) && within(com.spring.tutorial.di.setterbased.beans.dependent.*)")
	private void fooSetterMethodCall(Object obj) {
	}

	@After("fooConstructorCall() && notWithinAspects()")
	public void afterFooBeanCreationWithConstructor() {
		LOGGER.info("Foo bean instance created with constructor");
	}

	@After("fooCNamespaceConstructorCall() && notWithinAspects()")
	public void afterFooBeanCreationWithCNamespaceConstructor() {
		LOGGER.info("Foo bean instance created with c-namespace constructor");
	}

	@After("fooFactoryMethodCall() && notWithinAspects()")
	public void afterFooBeanCreationWithFactoryMethod() {
		LOGGER.info("Foo bean instance created with factory method");
	}

	@After("fooSetterMethodCall(obj) && notWithinAspects()")
	public void afterFooBeanCreationWithSetterMethod(Object obj) {
		LOGGER.info("Foo bean instance created with setter method for attribute of type "
				+ obj.getClass());
	}
}