package com.sb.SpringBootMay2026.angularspringbootTut.model;

import java.util.List;

public class Cart {

    private Long cartId;
    private List<Product> products;

    public Cart() {
    }

    public Cart(Long cartId, List<Product> products) {
        this.cartId = cartId;
        this.products = products;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}