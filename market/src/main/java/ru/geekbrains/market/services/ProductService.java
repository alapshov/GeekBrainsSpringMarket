package ru.geekbrains.market.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.market.dtos.CreateNewProductDto;
import ru.geekbrains.market.entities.Product;
import ru.geekbrains.market.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }

    public void createNewProduct(CreateNewProductDto createNewProductDto) {
        Product product = new Product();
        product.setTitle(createNewProductDto.getTitle());
        product.setPrice(createNewProductDto.getPrice());
        productRepository.save(product);
    }
}
