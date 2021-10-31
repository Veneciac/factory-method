/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.payment;

/**
 *
 * @author veneciacalista
 */
public class PaymentFactory {
    public Payment createPayment(String type) {
        if (type.equalsIgnoreCase("OVO")) {
            return new OvoPayment();
        }
        if (type.equalsIgnoreCase("CC")) {
            return new CreditCardPayment();
        }
        return new CashPayment();
    }

    public PaymentFactory() {
    }
}
