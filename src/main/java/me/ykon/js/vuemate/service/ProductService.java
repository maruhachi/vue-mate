package me.ykon.js.vuemate.service;

import me.ykon.js.vuemate.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();

    Product find(int id);
}
