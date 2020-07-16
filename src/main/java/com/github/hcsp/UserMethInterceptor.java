package com.github.hcsp;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-16 15:56
 */
public class UserMethInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("cglib "+method.getName());
        Object invoke = proxy.invoke(obj, args);
        return invoke;
    }
}
