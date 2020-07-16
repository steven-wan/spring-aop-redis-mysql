package com.github.hcsp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-16 13:30
 */
public class UserSerivceInvocationHandler implements InvocationHandler {
    private UserService userService;

    public UserSerivceInvocationHandler(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method:" + method.getName());
        Object invoke = method.invoke(userService, args);
        return invoke;
    }
}
