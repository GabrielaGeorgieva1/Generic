package com.telerikacademy.oop.contracts;

import com.telerikacademy.oop.enums.Currency;
import com.telerikacademy.oop.models.Product;

import java.time.LocalDate;
import java.util.List;

public interface Order {
    String getRecipient();

    Currency getCurrency();

    LocalDate getDeliveryOn();

    List<Product> getItems();

    void addItem(Product item);

    String getOrderItemsInfo();

    String getGeneralInfo();
}
