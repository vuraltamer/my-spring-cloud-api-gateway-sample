package gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-api")
public class SecondApiController {

	@GetMapping("/call")
	public String test() {
		return "Second api call!!!";
	}
}
