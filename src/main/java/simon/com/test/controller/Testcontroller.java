package simon.com.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import simon.com.test.service.TestService;

@RestController
public class Testconroller {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/")
    public String hello() {
        return "Hello Gradle Spring Boot!!!!";
	}
	@GetMapping("/test")
	public Map<String, Object> test() {
		String aa = "";
		Map<String, Object> aas = testService.selectTest();
		return aas;
	}
	@GetMapping("/testJPA")
	public Map<String, Object> testJPA() {
		String aa = "";
		Map<String, Object> aas = testService.selectTestJPA();
		return aas;
	}
}
