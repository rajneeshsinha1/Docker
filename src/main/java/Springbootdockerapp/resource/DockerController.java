package Springbootdockerapp.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {
	
	@GetMapping("/test")
	public String testDocker() {
		return "Testing Docker Example";
	}

}
