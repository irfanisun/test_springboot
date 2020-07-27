/**
 * 
 */
package com.infosun.sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
@ComponentScan
@SpringBootApplication
public class InfosunsampleApplication {

	private static final Logger log = LoggerFactory.getLogger(InfosunsampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(InfosunsampleApplication.class);
		
		try {
			RestTemplate template = new RestTemplate();
			String output = template.getForObject("http://localhost:8080/infosun/helloworld", String.class);
			log.info("***************************  "+output+"  ********************************");
		} catch (Exception e) {
			log.error("Exception: "+e);
		}
	}

}
