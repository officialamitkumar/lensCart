package com.example.cart.utility;

import com.example.cart.dto.CartDetails;
import com.example.cart.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartUtil {
    @Autowired
    RestTemplate restTemplate;

    public CartDetails toCartDetails(Cart cart){
        CartDetails  cartDetails = new CartDetails();
        cartDetails.setProductId(cart.getProductId());
        cartDetails.setId(cart.getId());
        cartDetails.setPricePerUnit(cart.getPricePerUnit());
        cartDetails.setDeliveryCharge(cart.getDeliveryCharge());
        cartDetails.setQuantity(cart.getQuantity());
        return cartDetails;

    }
   public double getPrice(int productId){
        return 100.0;
    }
   /* public double getPrice(int productId){
        String url="";
       double price =  restTemplate.getForObject(url,Double.class);
        return price;
    }*/

}
