package com.vasit.uaa.service.dto;

import java.util.List;

public class UserOrderRequestDTO {
    private List<Long> orders;


    public List<Long> getOrders() {
        return orders;
    }

    public void setOrders(List<Long> orders) {
        this.orders = orders;
    }
}
