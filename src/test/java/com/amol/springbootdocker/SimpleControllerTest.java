package com.amol.springbootdocker;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class SimpleControllerTest {
	 @Autowired
	 private MockMvc mockMvc;
	 
	 @Test
	  public void shouldReturnHelloWorld() throws Exception {
	    this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
	      .andExpect(content().string("Hello World from Docker!"));
	  }
}
