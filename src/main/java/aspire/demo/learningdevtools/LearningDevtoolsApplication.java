package aspire.demo.learningdevtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class LearningDevtoolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningDevtoolsApplication.class, args);
	}

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "hello, world!";
	}

}

