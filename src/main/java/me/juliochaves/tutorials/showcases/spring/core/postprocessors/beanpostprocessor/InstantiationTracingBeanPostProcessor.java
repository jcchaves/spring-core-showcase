package me.juliochaves.tutorials.showcases.spring.core.postprocessors.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.NonNull;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {
	// simply return the instantiated bean as-is
	public Object postProcessBeforeInitialization(@NonNull Object bean, @NonNull String beanName)
			throws BeansException {
		return bean; // we could potentially return any object reference here...
	}

	public Object postProcessAfterInitialization(@NonNull Object bean, @NonNull String beanName)
			throws BeansException {
		System.out.println("Bean '" + beanName + "' created : "
				+ bean.toString());
		return bean;
	}
}
