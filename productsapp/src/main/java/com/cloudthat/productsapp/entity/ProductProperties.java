package com.cloudthat.productsapp.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class ProductProperties {
    private String productColor;
    @NotBlank
    private Integer productLength;
    @NotBlank
    private Integer productWidth;
    private Integer productHeight;

    public ProductProperties(String productColor, Integer productLength, Integer productWidth, Integer productHeight) {
        this.productColor = productColor;
        this.productLength = productLength;
        this.productWidth = productWidth;
        this.productHeight = productHeight;
    }

    public ProductProperties() {
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public Integer getProductLength() {
        return productLength;
    }

    public void setProductLength(Integer productLength) {
    }
}