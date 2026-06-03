package com.sb.SpringBootMay2026.angularspringbootTut.controller;

import com.sb.SpringBootMay2026.angularspringbootTut.model.Cart;
import com.sb.SpringBootMay2026.angularspringbootTut.model.CartDTO;
import com.sb.SpringBootMay2026.angularspringbootTut.model.Product;
import com.sb.SpringBootMay2026.angularspringbootTut.model.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
public class CartController {

    @GetMapping("/cart")
    public CartDTO getCart() {

        List<Product> products = Arrays.asList(
                new Product(1L, "Phone", 32000),
                new Product(2L, "Laptop", 55000)
        );

        Cart cart = new Cart(202L, products);

        List<ProductDTO> productDTOList = cart.getProducts().stream().map(p -> new ProductDTO(p.getName(), p.getPrice())).collect(Collectors.toList());
        return new CartDTO(cart.getCartId(), productDTOList);
    }

}