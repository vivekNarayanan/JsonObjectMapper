package com.sf.json;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class Main {
	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException {
	
		SpringApplication.run(Main.class, args);
	}

	
}
