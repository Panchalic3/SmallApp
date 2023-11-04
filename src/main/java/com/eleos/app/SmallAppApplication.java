package com.eleos.app;

import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SmallAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallAppApplication.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanFactoryAnnotationUtils.class);
	}

}
