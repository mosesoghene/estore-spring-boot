package org.estore.estore.constroller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.estore.estore.utils.TestUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPlaceOrder() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mockMvc.perform(MockMvcRequestBuilders
                .post("/api/v1/order")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsBytes(TestUtil.buildCreateOrderRequest()))
        );
    }
}
