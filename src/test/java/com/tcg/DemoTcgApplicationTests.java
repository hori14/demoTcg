package com.tcg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tcg.DemoTcgApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoTcgApplication.class)
@WebAppConfiguration
public class DemoTcgApplicationTests {

	@Test
	public void contextLoads() {
	}

}
