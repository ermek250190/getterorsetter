package com.company;

public class Student {
//    private String name;
//    private String surname;
//    private int age;
//    private Lapton[] lapton;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Lapton[] getLapton() {
//        return lapton;
//    }
//
//    public void setLapton(Lapton[] lapton) {
//        this.lapton = lapton;
//    }
//
//    void getinfostudent(){
//         System.out.println(getName());
//         System.out.println(getSurname());
//         System.out.println(getAge());
//
//
//         for (Lapton res:getLapton()){
//             res.getinfolapton();
//         }
//     }

    private String name;
    private String surname;
    private int age;
    private Lapton[]lapton;

    public Lapton[] getLapton() {
        return lapton;
    }

    public void setLapton(Lapton[] lapton) {
        this.lapton = lapton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void getinfostudent() {
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getAge());
    }

         for ( Lapton res:getLapton()){
             res.getinfolapton();

    }

}