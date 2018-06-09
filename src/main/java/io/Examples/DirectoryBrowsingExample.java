package io.Examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryBrowsingExample {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Aneta\\Desktop\\PROGRANOWANIE");
        System.out.println(path.getFileName());
        Path parent = path.getParent();
        System.out.println(parent.getFileName());
        Path grandParent = parent.getParent();
        System.out.println(grandParent.getFileName());

        Path source = Paths.get("C:\\Users\\Aneta\\Desktop\\PROGRANOWANIE\\17.04.2018\\java-introductory-course\\src\\main\\java\\pl\\com\\empas\\java_introductory_course\\io\\Examples\\FileCreateExample.java");
        Path target = Paths.get(path.toAbsolutePath().toString() + "test.java");
        try {
            Files.copy(source, target);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

