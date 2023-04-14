package com.webapp.WaggingTales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
//import com.webapp.WaggingTales.Configuration.AppConfig;
@SpringBootApplication

public class WaggingTalesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WaggingTalesApplication.class, args);
	}


}
