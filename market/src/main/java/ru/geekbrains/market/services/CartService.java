package ru.geekbrains.market.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.market.dtos.AddProductInCartDto;
import ru.geekbrains.market.entities.Cart;
import ru.geekbrains.market.repositories.CartRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
   public final CartRepository cartRepository;

    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    public void deleteById(Long id){
        cartRepository.deleteById(id);
    }

    public void addProductInCart(AddProductInCartDto addProductInCartDto) {
        Cart cart = new Cart();
        cart.setTitle(addProductInCartDto.getTitle());
        cart.setPrice(addProductInCartDto.getPrice());
        cartRepository.save(cart);
    }
}
