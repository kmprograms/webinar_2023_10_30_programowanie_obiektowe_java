package com.app.obiektowosc_10.service;

import com.app.obiektowosc_10.model.Product;

import java.util.List;
import java.util.function.Predicate;

public interface ProductService {
    List<Product> findByPriceBetween(int priceMin, int priceMax);
    List<Product> findByNameStartingWith(String expression);
    List<Product> findBy(Predicate<Product> productTester);
}
