package com.example.cart.service;

import com.example.cart.dto.CartDetails;
import com.example.cart.dto.CartDetailsRequest;
import com.example.cart.entity.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ICartService {


    public List<Cart> getAllCartItems();

    public CartDetails addToCart(CartDetailsRequest request);

    public List<Cart> removeFromCart(int itemId);

    public List<Cart> getAllCartItemsByCustomerId(int customerId);

    public String removeAllByCustomerId(int customerId);

}
