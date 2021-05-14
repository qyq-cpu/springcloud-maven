package com.jk.qyq.entity;

import java.io.Serializable;

/**
 * @Auther:乔延琪
 * @Date: 2021/5/12 19:36
 * @Description:
 */
public class FoodEntity implements Serializable {

//t_food
    //：id、食品名称，食品价格，食品类型，生产日期，是否上架

  private   Integer id;
  private   Integer type;
  private   Integer status;

    private String name;
    private String date;
    private Double price;
//业务字段
private String mindate;
private String maxdate;
    private   Integer leixing;

    public Integer getLeixing() {
        return leixing;
    }

    public void setLeixing(Integer leixing) {
        this.leixing = leixing;
    }

    public String getMindate() {
        return mindate;
    }

    public void setMindate(String mindate) {
        this.mindate = mindate;
    }

    public String getMaxdate() {
        return maxdate;
    }

    public void setMaxdate(String maxdate) {
        this.maxdate = maxdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodEntity{" +
                "id=" + id +
                ", type=" + type +
                ", status=" + status +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                '}';
    }
}
