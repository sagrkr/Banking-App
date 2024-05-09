package com.sagar.bankingapp;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Banking Application",
				description = "Backend Rest APIs for SK Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Sagar Kumar",
						email = "krsk987@gmail.com",
						url = "https://github.com/sagrkr/Banking-App"
				),
				license = @License(
						name = "Sagar Kumar",
						url = "https://github.com/sagrkr/Banking-App"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Sagar Kumar Bank App Documentation",
				url = "https://github.com/sagrkr/Banking-App"
		)
)
public class BankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppApplication.class, args);
	}

}
