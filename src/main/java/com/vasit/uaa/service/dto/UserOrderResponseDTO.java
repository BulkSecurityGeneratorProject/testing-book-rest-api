package com.vasit.uaa.service.dto;

import java.math.BigDecimal;

public class UserOrderResponseDTO {
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
