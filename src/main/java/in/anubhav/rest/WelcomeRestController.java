package in.anubhav.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.anubhav.dto.Student;
import in.anubhav.service.ServiceData;

@RestController
public class WelcomeRestController {

	@Autowired
	private ServiceData srvc;

	@GetMapping("/data")
	public String h() {
		String data = srvc.data();
		return data;
	}
	
	@PostMapping("/data")
	public Student writeh(Student s1) {
		 Student putData = srvc.putData(s1);
		 return putData;
	}
}
