package com.example.demopracticacolecciones.model;


public class Person {
    private String id;
    private String name;
    private String age;
    private String phoneNumber;

    public Person(String id,String name,String age,String phoneNumber) {
        this.id=id;
        this.name = name;
        this.age=age;
        this.phoneNumber=phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
