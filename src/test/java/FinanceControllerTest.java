import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.google.common.net.MediaType;

import pl.sdacademy.course.AccountingNinja.FinanceController;

public class FinanceControllerTest {

	private MockMvc mockMvc;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(new FinanceController()).build();
	}

	@Test
	public void test() throws Exception {

		String text = "{\"cost\": 0, \"date\": 0, \"description\": \"string\", \"type\": \"string\",   \"vat\": 0 }";

		mockMvc.perform(MockMvcRequestBuilders.post("/transactions").contentType("application/json").content(text)) //
				.andExpect(MockMvcResultMatchers.status().isOk());
		// .andExpect(MockMvcResultMatchers.jsonPath("$", equalTo(true)));
		
		mockMvc.perform(MockMvcRequestBuilders.post("/transactions").contentType("application/json").content(text)) //
		.andExpect(MockMvcResultMatchers.status().isOk());

		mockMvc.perform(MockMvcRequestBuilders.get("/transactions")).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().isOk());
		// .andExpect(MockMvcResultMatchers.jsonPath("$[1]", equalTo("test")))
		// .andExpect(MockMvcResultMatchers.jsonPath("$[1]", equalTo("test")));

	}

}
