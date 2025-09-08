package com.wonjuninfo.projectbord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ProjectBordApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBordApplication.class, args);
	}

}
