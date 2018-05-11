package me.ykon.js.vuemate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class VueMateApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueMateApplication.class, args);
	}
}
