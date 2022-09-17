package com.cy.store.controller;

import com.cy.store.entity.Product;
import com.cy.store.service.IProductService;
import com.cy.store.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController extends BaseController {
    @Autowired
    private IProductService productService;

    @RequestMapping("hot_list")
    public JsonResult<List<Product>> getHotList() {
        List<Product> data = productService.findHotList();
        return new JsonResult<List<Product>>(OK, data);
    }
    @RequestMapping("page_list")
    public JsonResult<List<Product>> getPageList(HttpSession session) {
        List<Product> data= (List<Product>) session.getAttribute("productlist");
        if (data==null) {
            data = productService.findHotList();
            session.setAttribute("productlist", data);
        }
        return new JsonResult<List<Product>>(OK, data);
    }
    @GetMapping("{id}/details")
    public JsonResult<Product> getById(@PathVariable("id") Integer id) {
        // 调用业务对象执行获取数据
        Product data = productService.findById(id);
        // 返回成功和数据
        return new JsonResult<Product>(OK, data);
    }
    @RequestMapping("search/{title}")
    public JsonResult<List<Product>> getTitleByLike(HttpSession session,@PathVariable("title") String title) {

       List<Product> data = productService.findTitleByLike(title);

        return new JsonResult<List<Product>>(OK, data);
    }
}
