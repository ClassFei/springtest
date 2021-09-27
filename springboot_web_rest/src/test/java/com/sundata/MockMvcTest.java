package com.sundata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @Auth tangfei
 **/
@SpringBootTest
@AutoConfigureMockMvc
public class MockMvcTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void  testMockMVC() throws Exception {
        //language=JSON
        String user= "{\n" +
                "  \"username\": \"tangfei\",\n" +
                "  \"address\": \"jinan\"\n" +
                "}";
        mockMvc.perform(
                MockMvcRequestBuilders.get("/order")
        ).andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(MockMvcResultHandlers.print());
    }
}
