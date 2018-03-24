package learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "learning.abstractFactory")
public class AbstractFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryApplication.class, args);
	}
}
