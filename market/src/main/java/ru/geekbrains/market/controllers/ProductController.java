package ru.geekbrains.market.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.market.dtos.CreateNewProductDto;
import ru.geekbrains.market.entities.Product;
import ru.geekbrains.market.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewProducts(@RequestBody CreateNewProductDto createNewProductDto) {
        productService.createNewProduct(createNewProductDto);
    }
}
