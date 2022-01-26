package gateway;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.result.view.RedirectView;

@RestController
@RequestMapping("/first-api")
public class FirstApiController {

	@GetMapping("/")
	protected RedirectView home() {
		return new RedirectView("/swagger-ui.html");
	}

	@GetMapping("/call")
	public String test() {
		return "First api call!!!";
	}
}
