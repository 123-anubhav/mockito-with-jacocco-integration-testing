package in.anubhav;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.anubhav.dto.Student;
import in.anubhav.rest.WelcomeRestController;
import in.anubhav.service.ServiceData;

@WebMvcTest(value = WelcomeRestController.class)
public class WelcomeRestControllerTest {
	
	@MockBean
	private ServiceData srvc;
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void dataTest() throws Exception {
		
		when(srvc.data()).thenReturn("Welcome to Ashok IT...!!");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/data");
		
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);
	}
	
	
	@Test
	public void dataPurTest() throws Exception {
		Student s = new Student();
		s.setEmailId("abc@gmail.com");
		s.setName("abc");
		
		Student s1 = new Student();
		s1.setEmailId("lal@gmail.com");
		s1.setName("lal");
		
		when(srvc.putData(s)).thenReturn(s1);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/data");
		
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);
	}

}
