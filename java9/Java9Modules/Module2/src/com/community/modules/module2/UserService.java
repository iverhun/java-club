package com.community.modules.module2;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by vagrant on 4/6/17.
 */
public class UserService {
    public void printUser(User user) {
        System.out.println(user.getName());
    }

    public void saveUser(User user) throws Exception {
        Path file =  Files.createTempFile("demoModules1", "txt");
        System.out.println(file.toString());
        try(FileOutputStream outputStream = new FileOutputStream(file.toFile())) {
            outputStream.write(user.getName().getBytes());
        }
    }
}
