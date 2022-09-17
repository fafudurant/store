package com.cy.store.service;

import com.cy.store.entity.Order;
import com.cy.store.entity.Product;
import com.cy.store.vo.CartVO;
import com.cy.store.vo.OrderVO;

import java.util.List;

/** 处理订单和订单数据的业务层接口 */
public interface IOrderService {
    /**
     * 创建订单
     * @param aid 收货地址的id
     * @param cids 即将购买的商品数据在购物车表中的id
     * @param uid 当前登录的用户的id
     * @param username 当前登录的用户名
     * @return 成功创建的订单数据
     */
    Order create(Integer aid, Integer[] cids, Integer uid, String username);
    /**
     * 根据若干个订单数据id查询详情的列表
     * @param uid 当前登录的用户的id
     * @return 匹配的购物车数据详情的列表
     */
    List<OrderVO> getByUid(Integer uid);
    /**
     * 将商品从订单删除
     * @param oid 当前数据的id
     */
    void deleteToOrder(Integer oid);
}
