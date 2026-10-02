package fr.takima.training.simpleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApiApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SimpleApiApplication.class);
        application.setAddCommandLineProperties(true);
		application.run(args);
	}

}
