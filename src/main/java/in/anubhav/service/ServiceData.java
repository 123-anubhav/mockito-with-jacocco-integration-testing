package in.anubhav.service;

import org.springframework.stereotype.Service;

import in.anubhav.dto.Student;

@Service
public class ServiceData {

	public String data() {

		return "hi abc!...";
	}

	public Student putData(Student obj) {
		// jpa.save(obj);
		return obj;
	}
}
