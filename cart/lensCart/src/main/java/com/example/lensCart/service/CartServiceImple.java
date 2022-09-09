package com.example.cart.service;


import com.example.cart.dto.CartDetails;
import com.example.cart.dto.CartDetailsRequest;
import com.example.cart.entity.Cart;
import com.example.cart.repository.CartRepository;
import com.example.cart.utility.CartUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
class CartServiceImpl implements ICartService{
    @Autowired
    CartRepository cartRepo;
    @Autowired
    CartUtil cartUtil;
    @Override
    public List<Cart> getAllCartItems() {
        return cartRepo.findAll();
    }

    @Override
    public CartDetails addToCart(CartDetailsRequest request) {

        Cart cart = new Cart();
        cart.setProductId(request.getProductId());
        cart.setQuantity(request.getQuantity());
        cart.setPricePerUnit(cartUtil.getPrice(request.getProductId()));

        cart = cartRepo.save(cart);

        CartDetails details = cartUtil.toCartDetails(cart);
        return details;
    }


    @Override
    public List<Cart> removeFromCart(int itemId) {
        cartRepo.deleteById(itemId);
        return cartRepo.findAll();
    }

    @Override
    public String removeAllByCustomerId(int customerId) {
        cartRepo.deleteByCustomerId(customerId);
        return "All Cart Items Deleted Successfully!";
    }

    @Override
    public List<Cart> getAllCartItemsByCustomerId(int customerId) {
        return cartRepo.findAllByCustomerId(customerId);
    }
}
