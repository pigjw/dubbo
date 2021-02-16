package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;
import service.UserService;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
//        OrderService userService = ioc.getBean( OrderService.class);
//        userService.initOrder("1");
        System.out.println("调用完成。。。");
        System.in.read();

    }
}
