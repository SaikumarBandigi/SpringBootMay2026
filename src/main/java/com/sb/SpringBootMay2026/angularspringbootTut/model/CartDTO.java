package com.sb.SpringBootMay2026.angularspringbootTut.model;

import java.util.List;

public class CartDTO {

    private Long cartId;
    private List<ProductDTO> products;

    public CartDTO() {
    }

    public CartDTO(Long cartId, List<ProductDTO> products) {
        this.cartId = cartId;
        this.products = products;
    }

    public Long getCartId() {
        return cartId;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }


}