package com.gtang94;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @class: BeanFactoryTest
 * @description:
 * @author: tanggq
 * @date: 2021/9/3
 * @version: 1.0
 */
public class MyBeanTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MyBean.xml");
		Object myBean = context.getBean("myBean");
		System.err.println(myBean.toString());
	}

}
