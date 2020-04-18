package com.day08;

import java.util.Objects;

public class Order {
    public Order(int orderId,String orderName){
        this.orderId = orderId;
        this.orderName = orderName;
    }

    int orderId;
    String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Order){
            Order or = (Order) obj;
            if(this.orderId == or.orderId && this.orderName.equals(or.orderName)){
                return true;
            }
        }
        return false;
    }
}
