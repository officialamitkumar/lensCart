package com.example.cart.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Table(name="cartdetails")
@Entity
public class Cart {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="customerid")
    @NotBlank
    private int customerId;
    @NotBlank
    @Column(name="productid")
    private int productId;
    @NotBlank
    @Column(name="quantity")
    private int quantity;
    @NotBlank
    @Column(name="price")
    private double pricePerUnit;
    @NotBlank
    @Column(name="deliverycharge")
    private double deliveryCharge;

    public double getDeliveryCharge() {
        return deliveryCharge;
    }
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public void setDeliveryCharge(double deliveryCharge) {
        this.deliveryCharge = 50.0;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }


}
