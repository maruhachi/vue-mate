package me.ykon.js.vuemate.repository;

import me.ykon.js.vuemate.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductRepository {

    @Select("Select id, name, price from product")
    List<Product> findAll();

    @Select("Select id,name, price from product where id = #id")
    Product find(int id);
}
