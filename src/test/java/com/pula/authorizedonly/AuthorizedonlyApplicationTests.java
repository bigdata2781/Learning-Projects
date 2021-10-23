package com.pula.authorizedonly;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(properties = {"spring.profiles.active:uat"})
//@TestPropertySource(properties = {"spring.profiles.active:local"})
class AuthorizedonlyApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	
	@Test
	void contextLoadsHeaderForSSOPositive() throws Exception {
		this.mockMvc.perform(get("http://localhost:8080/blogs").header("SM_USER", "naveen")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	void contextLoadsHeaderForSSONegative() throws Exception {
		this.mockMvc.perform(get("http://localhost:8080/blogs").header("SM_USER", "naveen2")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	void contextLoadsParamForLocalPositive() throws Exception {
		this.mockMvc.perform(get("http://localhost:8080/blogs?SM_USER=naveen")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	void contextLoadsParamForLocalNegative() throws Exception {
		this.mockMvc.perform(get("http://localhost:8080/blogs?SM_USER=naveen2")).andDo(print()).andExpect(status().isOk());
	}

}
