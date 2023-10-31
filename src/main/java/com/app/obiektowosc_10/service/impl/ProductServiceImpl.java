package com.app.obiektowosc_10.service.impl;

import com.app.obiektowosc_10.model.Product;
import com.app.obiektowosc_10.service.ProductService;

import java.util.List;
import java.util.function.Predicate;

public class ProductServiceImpl implements ProductService {
    private final List<Product> products;

    public ProductServiceImpl(List<Product> products) {
        this.products = products;
    }

    @Override
    public List<Product> findByPriceBetween(int priceMin, int priceMax) {
        return findBy(p -> p.hasPriceBetween(priceMin, priceMax));
    }

    @Override
    public List<Product> findByNameStartingWith(String expression) {
        return findBy(p -> p.hasNameStartingWith(expression));
    }

    @Override
    public List<Product> findBy(Predicate<Product> productTester) {
        return products
                .stream()
                .filter(productTester)
                .toList();
    }
}
