package com.gtang94.extensions;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author tanggq
 * @class
 * @description
 * @date 2022/3/21
 */
@Component
@Order(100)
public class BeanFactoryPostProcessorExtension implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition myBeanDefinition = beanFactory.getBeanDefinition("myBean");
		System.err.println(myBeanDefinition.getParentName());
	}
}
