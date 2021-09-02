package org.springframework.beans.gtang94;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.gtang94.bean.MyTestBean;
import org.springframework.core.io.ClassPathResource;

/**
 * @class: BeanFactoryTest
 * @description:
 * @author: tanggq
 * @date: 2021/9/3
 * @version: 1.0
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("MyTestBean.xml", getClass()));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.err.println(bean.getTestStr());
	}
}
