package com.jy;

import com.jy.entity.Order;
import com.jy.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        OrderService orderService = context.getBean("orderService", OrderService.class);
        Order order = new Order();
        //设置商品 id
        order.setProductId("1");
        //商品数量为 30
        order.setCount(30);
        //商品金额为 600
        order.setMoney(new BigDecimal(600));
        //设置用户 id
        order.setUserId("1");
        //订单状态为未完成
        order.setStatus(0);
        orderService.createOrder(order);
    }
}
