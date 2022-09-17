package com.cy.store.service;

import com.cy.store.entity.Product;

import java.util.List;

/** 处理商品数据的业务层接口 */
public interface IProductService {
    /**
     * 查询热销商品的前四名
     * @return 热销商品前四名的集合
     */
    List<Product> findHotList();
    /**
     * 查询商品
     * @return 商品的集合
     */
    List<Product> findProductList();
    /**
     * 根据商品id查询商品详情
     * @param id 商品id
     * @return 匹配的商品详情，如果没有匹配的数据则返回null
     */
    Product findById(Integer id);
    /**
     * 模糊查询商品
     * @return 商品的集合
     */
    List<Product> findTitleByLike(String title);
}
