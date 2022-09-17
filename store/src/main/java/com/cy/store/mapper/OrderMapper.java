package com.cy.store.mapper;

import com.cy.store.entity.Cart;
import com.cy.store.entity.Order;
import com.cy.store.entity.OrderItem;
import com.cy.store.entity.Product;
import com.cy.store.vo.OrderVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/** 处理订单及订单商品数据的持久层接口 */
public interface OrderMapper {
    /**
     * 插入订单数据
     * @param order 订单数据
     * @return 受影响的行数
     */
    Integer insertOrder(Order order);

    /**
     * 插入订单商品数据
     * @param orderItem 订单商品数据
     * @return 受影响的行数
     */
    Integer insertOrderItem(OrderItem orderItem);
    /**
     * 根据uid查询订单
     */
    List<OrderVO> selectOrderByUid(@Param("uid") Integer uid);
    /**
     * 删除订单数据中商品
     * @param oid 购物车数据的id
     * @return 受影响的行数
     */
    Integer deleteByOid(@Param("oid") Integer oid);
    /**
     * 根据订单数据id查询购物车数据详情
     * @param oid 订单数据id
     * @return 匹配的购物车数据详情，如果没有匹配的数据则返回null
     */
    Order findByOid(Integer oid);
}
