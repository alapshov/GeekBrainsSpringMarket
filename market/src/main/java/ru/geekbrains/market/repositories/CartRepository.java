package ru.geekbrains.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.market.entities.Cart;
import ru.geekbrains.market.entities.Product;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
