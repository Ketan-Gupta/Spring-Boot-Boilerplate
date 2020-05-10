package com.cryolite.springbootv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootV1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootV1Application.class, args);
		Parent obj = context.getBean(Parent.class);
		obj.setIndex(1);
		System.out.println(obj.getIndex());

		Parent obj2 = context.getBean(Parent.class);
		obj2.setIndex(3);
		System.out.println(obj.getIndex());
	}

}
