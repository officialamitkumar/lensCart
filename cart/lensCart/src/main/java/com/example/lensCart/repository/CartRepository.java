package com.example.cart.repository;

import com.example.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Integer> {

    public List<Cart> findAllByCustomerId(int customerId);

    public void deleteByCustomerId(int customerId);
}
