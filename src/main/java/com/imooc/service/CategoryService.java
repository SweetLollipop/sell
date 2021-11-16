package com.imooc.service;

import com.imooc.dataObject.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory getOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);//新增与更新
}
