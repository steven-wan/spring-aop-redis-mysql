package com.github.hcsp;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-16 10:49
 */
public class UserSericeDecorator implements UserService {
    private UserService userService;

    public UserSericeDecorator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String findName() {
        System.out.println("method:findName");
        return userService.findName();
    }

    @Override
    public void printlnName() {
        System.out.println("method:printlnName");
        userService.printlnName();
    }
}
