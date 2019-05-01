package com.vasit.uaa.service.dto;

import java.util.Set;

public class UserOrderRequestDTO {
    private Set<Long> orders;

    public UserOrderRequestDTO(Set<Long> orders) {
        this.orders = orders;
    }

    public Set<Long> getOrders() {
        return orders;
    }

    public void setOrders(Set<Long> orders) {
        this.orders = orders;
    }
}
