package com.project.coursesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CoursesapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesapiApplication.class, args);
	}

}
