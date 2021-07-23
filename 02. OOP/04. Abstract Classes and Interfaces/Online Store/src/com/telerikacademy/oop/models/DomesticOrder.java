package com.telerikacademy.oop.models;

import com.telerikacademy.oop.enums.Currency;

import java.time.LocalDate;

public class DomesticOrder extends BaseOrder {


    public DomesticOrder(String recipient, Currency currency, LocalDate deliveryOn) {
        super(recipient, currency, deliveryOn);
    }

    @Override
    protected String getOrderType() {
        return "Domestic";
    }
}
