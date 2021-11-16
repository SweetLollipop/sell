package com.imooc.daoRepository;

import com.imooc.dataObject.ProductCategory;
import com.imooc.SellApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SellApplication.class)
public class ProductCategoryRepositoryTest {
    
    @Resource
    private ProductCategoryRepository repository;
    
    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.getOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱",4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result); //断言不期望为空，实际为result
    }

    @Test
    public void modifyNameTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱",3);
        productCategory.setCategoryId(2);
//        productCategory.setCategoryName("男生最爱");
//        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }

    @Test
    public void modifyTypeTest(){
        ProductCategory productCategory = repository.getOne(2);
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}