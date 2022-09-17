package com.cy.store.vo;

import java.io.Serializable;

public class OrderVO implements Serializable {
    private Integer oid;
    private Integer uid;
    private Long total_price;
    private String recv_name;
    private String created_time;
    private Long price;
    private Integer num;
    private String title;
    private Long realPrice;
    private String image;

    public OrderVO() {
    }

    public OrderVO(Integer oid, Integer uid, Long total_price, String recv_name, String created_time, Long price, Integer num, String title, Long realPrice, String image) {
        this.oid = oid;
        this.uid = uid;
        this.total_price = total_price;
        this.recv_name = recv_name;
        this.created_time = created_time;
        this.price = price;
        this.num = num;
        this.title = title;
        this.realPrice = realPrice;
        this.image = image;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Long getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Long total_price) {
        this.total_price = total_price;
    }

    public String getRecv_name() {
        return recv_name;
    }

    public void setRecv_name(String recv_name) {
        this.recv_name = recv_name;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Long realPrice) {
        this.realPrice = realPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", total_price=" + total_price +
                ", recv_name='" + recv_name + '\'' +
                ", created_time='" + created_time + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", title='" + title + '\'' +
                ", realPrice=" + realPrice +
                ", image='" + image + '\'' +
                '}';
    }
}
