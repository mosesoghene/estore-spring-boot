package org.estore.estore.utils;

import org.estore.estore.dto.request.CreateOrderRequest;
import org.estore.estore.dto.request.ItemRequest;

import java.util.List;

public class TestUtil {
    public static CreateOrderRequest buildCreateOrderRequest() {
        CreateOrderRequest order = new CreateOrderRequest();
        order.setItems(List.of(new ItemRequest("26943268-c87b-4d41-af5e-2cc83a6d2bc8", 2),
                new ItemRequest("1c7469de-63ec-4299-a160-3e03d3a2e3c8", 5)));
        order.setCartId("7cfbabc9-92f6-427d-b2b0-6acf84aaa881");
        return order;
    }
}
