package com.codewithmosh.store;

public class OrderService {

    public void placeOrder() {
        var paymentService = new PaymentService();
        paymentService.proceesPayment(10);
    }
}
