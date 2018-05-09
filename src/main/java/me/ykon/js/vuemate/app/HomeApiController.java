package me.ykon.js.vuemate.app;

import lombok.extern.slf4j.Slf4j;
import me.ykon.js.vuemate.entity.Product;
import me.ykon.js.vuemate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api")
@Slf4j
public class HomeApiController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/products")
    public List<Product> products(){
        List<Product> products = productService.findAll();

        log.info(products.toString());

        return products;
    }

    @GetMapping("/product")
    public Product product(@RequestParam("id")int id){
        Product product = productService.find(id);
        return product;

    }
}
