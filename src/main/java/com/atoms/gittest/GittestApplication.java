package com.atoms.gittest;

import com.atoms.gittest.model.TestModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class GittestApplication {

	public static void main(String[] args) {
		TestModel model = new TestModel();
		System.out.println("Model ---> " + model);
//		SpringApplication.run(GittestApplication.class, args);
		System.out.println("Testing Second Commit");
	}

}
