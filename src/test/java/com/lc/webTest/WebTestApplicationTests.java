package com.lc.webTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebTestApplicationTests {

	@Test
	public void contextLoads() {
		AnnotationConfigApplicationContext aa=new AnnotationConfigApplicationContext();
	}

}
