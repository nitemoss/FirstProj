package lesson3;

import java.util.UUID;

public class Student {
    private String name;
    private String uid;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.uid = UUID.randomUUID().toString();
    }


}

