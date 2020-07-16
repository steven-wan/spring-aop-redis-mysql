package com.github.hcsp;

import net.sf.cglib.proxy.Enhancer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Proxy;

//@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
      //  userService.printlnName();

//        //装饰器模式
//        UserSericeDecorator userSericeDecorator = new UserSericeDecorator(userService);
//        userSericeDecorator.printlnName();
//
//
//        //jdk 自带的 代理模式
//        UserService proxyInstance = (UserService)Proxy.newProxyInstance(Application.class.getClassLoader(), new Class[]{UserService.class}, new UserSerivceInvocationHandler(userService));
//        proxyInstance.printlnName();
//        proxyInstance.findName();

        //cglib

        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new UserMethInterceptor());
        enhancer.setSuperclass(UserServiceImpl.class);
        UserService enhancerInstance = (UserService)enhancer.create();

        enhancerInstance.printlnName();

        //   SpringApplication.run(Application.class, args);
    }
}
