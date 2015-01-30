package org.sl.shop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:conf/servlet-context.xml" })
public class SpringMVCUnitTestBase {
	@Autowired
	private ApplicationContext applicationContext;
	private WebApplicationContext webApplicationContext;

	@Before
	public void before() {
		
	}
	
	@After
	public void after() {
		
	}
	

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public WebApplicationContext getWebApplicationContext() {
		return webApplicationContext;
	}
	
	
}