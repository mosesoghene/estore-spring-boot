package org.estore.estore.service;

import org.estore.estore.dto.request.CreateOrderRequest;
import org.estore.estore.dto.response.CreateOrderResponse;
import org.estore.estore.utils.TestUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    @Sql(scripts = {"/db/script.sql"})
    public void testCanPlaceOrder() {
        CreateOrderRequest order = TestUtil.buildCreateOrderRequest();
        CreateOrderResponse createOrderResponse = orderService.create(order);
        assertNotNull(createOrderResponse);
        assertThat(createOrderResponse.getMessage())
                .containsIgnoringCase("Order Placed Successfully");
    }
}
