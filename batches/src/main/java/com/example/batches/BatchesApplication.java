package com.example.batches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;

@SpringBootApplication
public class BatchesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchesApplication.class, args);
	}

}
