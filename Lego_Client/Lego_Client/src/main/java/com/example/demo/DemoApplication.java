package com.example.demo;

import com.example.demo.wsdl.GetLegoResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(LegoClient quoteClient) {
		return args -> {
			String lego = "SW1";

			if (args.length > 0) {
				lego = args[0];
			}
			GetLegoResponse response = quoteClient.getLego(lego);
			System.err.println(response.getLego().getLegoNumber());
		};
	}

}
