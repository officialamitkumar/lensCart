package com.example.cart.dto;

public class CartDetails {



        private int id;


       // private int customerId;


        private int productId;

        private int quantity;


        private double pricePerUnit;


        private double deliveryCharge;

        public double getDeliveryCharge() {
            return deliveryCharge;
        }

        private int getId() {
            return id;
        }

        public void setId(int id) {
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
