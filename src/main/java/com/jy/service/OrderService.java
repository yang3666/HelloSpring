package com.jy.service;

import com.jy.entity.Order;

public interface OrderService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    public void createOrder(Order order);
}
