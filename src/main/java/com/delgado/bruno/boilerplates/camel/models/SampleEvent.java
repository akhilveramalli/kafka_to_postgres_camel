package com.delgado.bruno.boilerplates.camel.models;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;


public class SampleEvent {

    private String payload;
    // private Integer quantity;
    // private BigDecimal price;

    public String getName() {
        
        return payload;
    }

    public void setName(String payload) {
        this.payload = payload;
    }

    // public Integer getQuantity() {
    //     return quantity;
    // }

    // public void setQuantity(Integer quantity) {
    //     this.quantity = quantity;
    // }

    // public BigDecimal getPrice() {
    //     return price;
    // }

    // public void setPrice(BigDecimal price) {
    //     this.price = price;
    // }
}
