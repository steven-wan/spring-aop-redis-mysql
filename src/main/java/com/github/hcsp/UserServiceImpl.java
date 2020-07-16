package com.github.hcsp;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-16 10:43
 */
public class UserServiceImpl implements UserService {
    @Override
    public String findName() {
        return "装饰器模式：万万";
    }

    @Override
    public void printlnName() {
        System.out.println("打印装饰器模式：Steven");
    }
}
