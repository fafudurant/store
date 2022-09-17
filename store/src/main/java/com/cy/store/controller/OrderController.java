package com.cy.store.controller;

import com.cy.store.entity.Order;
import com.cy.store.service.IOrderService;
import com.cy.store.util.JsonResult;
import com.cy.store.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController extends BaseController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping("create")
    public JsonResult<Order> create(Integer aid, Integer[] cids, HttpSession session) {
        // 从Session中取出uid和username
        Integer uid = getUidFromSession(session);
        String username = getUsernameFromSession(session);
        // 调用业务对象执行业务
        Order data = orderService.create(aid, cids, uid, username);
        // 返回成功与数据
        return new JsonResult<Order>(OK, data);
    }
    @GetMapping("list")
    public JsonResult<List<OrderVO>> getByUid( HttpSession session) {
        // 从Session中获取uid
        Integer uid = getUidFromSession(session);
        // 调用业务对象执行查询数据
        List<OrderVO> data = orderService.getByUid(uid);
        // 返回成功与数据
        return new JsonResult<List<OrderVO>>(OK, data);
    }
    @RequestMapping("{oid}/delete")
    public JsonResult<Void> deleteToOrder(@PathVariable("oid") Integer oid) {
        // 调用业务对象执行删除
        orderService.deleteToOrder(oid);
        // 返回成功
        return new JsonResult<Void>(OK);
    }
}
