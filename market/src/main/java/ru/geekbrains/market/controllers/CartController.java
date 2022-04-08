package ru.geekbrains.market.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.market.dtos.AddProductInCartDto;
import ru.geekbrains.market.entities.Cart;
import ru.geekbrains.market.services.CartService;


import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @GetMapping
    public List<Cart> getAllProductsInCart() {
        return cartService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        cartService.deleteById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProductInCartDto(@RequestBody AddProductInCartDto addProductInCartDto) {
        cartService.addProductInCart(addProductInCartDto);
    }

}
