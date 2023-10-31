package com.app.obiektowosc_10;

import com.app.obiektowosc_10.model.Product;
import com.app.obiektowosc_10.service.impl.ProductServiceImpl;

import java.util.List;

public class App10 {
    public static void main(String[] args) {
        var products = List.of(
          new Product("A", 100),
          new Product("B", 150),
          new Product("C", 200)
        );
        var productsService = new ProductServiceImpl(products);
        System.out.println(productsService.findByPriceBetween(100, 150));
        System.out.println(productsService.findBy(p -> p.hasNameStartingWith("A")));
    }
}
