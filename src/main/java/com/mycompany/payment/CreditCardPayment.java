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
public class CreditCardPayment extends Payment {
    CreditCardPayment() {
        super();
    }

    public String pay() {
        return "Paid using credit card";
    }
}
