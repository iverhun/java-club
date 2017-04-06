package com.community.modules.module1;

import com.community.modules.module2.User;
import com.community.modules.module2.UserService;

/**
 * Created by vagrant on 4/5/17.
 */
public class Main {
    public static void main(String ... args) throws Exception {
        System.out.println("Hello world");
        User user1 = new User("Banadizhka");
        UserService userService = new UserService();
        userService.printUser(user1);

        User user2 = new User("Tarasulka");
        userService.saveUser(user2);
    }
}