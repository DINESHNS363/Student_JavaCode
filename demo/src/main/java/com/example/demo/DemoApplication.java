package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		this.studentRepository.save(new Student("Ramesh", "Kumar", "ramsh@gmail.com" ));
		this.studentRepository.save(new Student("Ramesh12", "Kumar12", "ramsh12@gmail.com" ));
		
	}

}
