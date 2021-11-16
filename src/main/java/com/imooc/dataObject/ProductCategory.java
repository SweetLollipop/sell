package com.imooc.dataObject;



import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@DynamicUpdate  /**动态更新时间*/
@Data  /**自动生成Set,Get,toString方法*/
@Proxy(lazy = false)
public class ProductCategory {

    /** 类目id. */
    @Id                           /**主键*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)   /**自增类型*/
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

//    /** 创建时间. */
//    private Date createTime;
//
//    /** 修改时间. */
//    private Date updateTime;

    /** 生成get、set方法*/
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }


    public ProductCategory() {
    }


    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
