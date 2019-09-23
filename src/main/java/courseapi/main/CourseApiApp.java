package courseapi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"courseapi"})
@SpringBootApplication
public class CourseApiApp {
	
	public static void main(String...strings) {
		SpringApplication.run(CourseApiApp.class, strings);
	}

}
