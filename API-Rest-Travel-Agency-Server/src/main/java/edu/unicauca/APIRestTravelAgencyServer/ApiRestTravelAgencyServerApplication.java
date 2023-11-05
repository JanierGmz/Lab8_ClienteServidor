package edu.unicauca.APIRestTravelAgencyServer;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestTravelAgencyServerApplication {

	public static void main(String[] args) {
                SpringApplication appSpring = new SpringApplication(ApiRestTravelAgencyServerApplication.class);
                appSpring.setDefaultProperties(Collections.singletonMap("server.port", "8085"));
                appSpring.run(args);
	}

}
