package com.example.cart;

import com.example.cart.entity.Cart;
import com.example.cart.exception.CustoemrNotAvailabeException;
import com.example.cart.exception.EmptyCartException;
import com.example.cart.exception.ItemNotInCartException;
import com.example.cart.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/lenscart")
public class cartController {

    @Autowired
    private ICartService cartService;


    @GetMapping("/cart")
    public ResponseEntity<List<Cart>> getAllCartItems()  throws EmptyCartException {
        return new ResponseEntity<List<Cart>>(cartService.getAllCartItems(), HttpStatus.OK);
    }

    @DeleteMapping("/cart/{itemId}")
    public ResponseEntity<List<Cart>> removeFromCart(@PathVariable("itemId") int itemId) throws ItemNotInCartException {
        List<Cart> cartList = cartService.removeFromCart(itemId);
        return new ResponseEntity<List<Cart>>(cartList, HttpStatus.OK);
    }


    @DeleteMapping("/cart/customerId/{customerId}")
    public ResponseEntity<String> removeAllByCustomerId(@PathVariable("customerId") int customerId) throws CustoemrNotAvailabeException {
        String response = cartService.removeAllByCustomerId(customerId);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

    @GetMapping("/cart/getAll/{customerId}")
    public ResponseEntity<List<Cart>> getAllCartItemsByCustomerId(@PathVariable("customerId") int customerId) {
        return new ResponseEntity<List<Cart>>(cartService.getAllCartItemsByCustomerId(customerId), HttpStatus.OK);
    }
}
