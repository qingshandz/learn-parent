package com.cn.coder.lab05shardingsubdb.entity;

/**
 * @USER wh
 * @DATE 2020/9/14
 * @Description
 */
public class OrderEntity {

    private Long id;

    private Long userId;

    private String productName;

    private String price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
