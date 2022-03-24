package com.ciandt.interview;

import com.ciandt.interview.service.PatientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.inject.Inject;

@SpringBootApplication
@ComponentScan("com.ciandt")
@EnableWebMvc
public class InterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);




	}

}
