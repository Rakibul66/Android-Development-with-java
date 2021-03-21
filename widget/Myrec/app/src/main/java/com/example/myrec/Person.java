package com.example.myrec;

public class Person {
    private String name;
    private String number;
    private String group;

    public Person(String name, String number,  String group) {
        this.number = number;
        this.name = name;
        this.group= group;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
