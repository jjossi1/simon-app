package simon.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimonApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(SimonApplication.class, args);
	}
	
	// WAR 배포용 설정
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SimonApplication.class);
	}
}
