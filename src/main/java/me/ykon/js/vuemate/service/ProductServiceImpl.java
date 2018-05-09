package me.ykon.js.vuemate.service;

import me.ykon.js.vuemate.entity.Product;
import me.ykon.js.vuemate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    public Product find(int id){
        Product product = productRepository.find(id);
        return  product;
    }
}
