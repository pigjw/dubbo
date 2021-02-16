package com.example.bootorderserviceconsumer.impl;

import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

/**
 * 1.将服务提供者注册到注册中心(暴露服务)
 *      1.导入dubbo依赖 (2.6.2) 引入操作zookeeper的客户端（curator）
 *      2.配置服务提供者
 * 2.让服务消费者去注册中心订阅服务提供者的订阅地址
 */
@Service
public class OrderServiceImpl implements OrderService {
    //@Autowired
    @Reference
    private UserService userService;

    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id:"+userId);
        //1.查询用户的收获地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
//        for (UserAddress userAddress:userAddressList){
//            System.out.println(userAddress.getUserAddress());
//        }
        return userAddressList;
    }
}
