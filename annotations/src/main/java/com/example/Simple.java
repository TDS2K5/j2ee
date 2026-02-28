package com.example;

import java.lang.annotation.*;
// import java.net.Authenticator;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();

    String date();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Descriptor {
    String str();
}

@Author(name = "John Doe", date = "2025/03")
class Example {
    @Descriptor(str = "This is a simple class with custom annotations")
    public void getData() {
        System.out.println(
                "Hi");
    }
}

public class Simple {
    public static void main(String[] args) {
        Class<Example> obj = Example.class;

        Author authorAnnotation = obj.getAnnotation(Author.class);

        System.out.println("Author : " + authorAnnotation.name() + ",Date : " + authorAnnotation.date());

        System.out.println("All annotations : ");
        for (Annotation annotation : obj.getAnnotations()) {
            System.out.println(annotation);
        }
    }
}