package com.fintech.banking;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Fintech banking app",
				description = "Backend REST APIs for fintech banking app",
				version = "v1.0",
				contact = @Contact(
						name = "Hardik Aswal",
						email = "harik.aswal@gmail.com",
						url = "https://github.com/HardikAswal"
				),
				license = @License(
						name = "Fintech banking",
						url = "https://github.com/HardikAswal"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Fintech baking REST API documentation",
				url = "https://github.com/HardikAswal"
		)
)
public class BankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

}
