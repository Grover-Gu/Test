package com.yingb;

public class Father {
    private String age;
    private String name;
    private String email;

    public Father(String age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public Father() {
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
