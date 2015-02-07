package org.sl.shop;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUnitTestBase {

	private ClassPathXmlApplicationContext context;
	private String springXmlPath;

	public SpringUnitTestBase() {
	}

	public SpringUnitTestBase(String springXmlPath) {
		this.springXmlPath = springXmlPath;
	}

	@Before
	public void before() {
		System.out.println("before");
		if (this.springXmlPath.isEmpty())
			springXmlPath = "classpaht*:spring-*.xml";
		try {
			context = new ClassPathXmlApplicationContext(
					springXmlPath.split("[,\\s]+"));
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

	@After
	public void after() {
		context.destroy();
	}

	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId) {
		return (T) context.getBean(beanId);
	}

	protected <T extends Object> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}

}
