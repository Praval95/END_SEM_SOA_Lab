
package com.example.ms1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(Ms1Controller.class)
class Ms1ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testAdd() throws Exception {

        mockMvc.perform(get("/ms1/add")
                .param("a", "5")
                .param("b", "10"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("MS1 Addition=15"));
    }
}
