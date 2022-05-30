package it.uniroma3.catering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
public class ProgCateringApplication {

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 registry.addResourceHandler("/**")
        		 .addResourceLocations("classpath:/static/**");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProgCateringApplication.class, args);
	}

}
