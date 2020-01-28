package com.company;

public class Main {

    public static void main(String[] args) {
        BuilderPerson builderPerson=new BuilderPerson ()
                .setFullName("mahsa eftekhari")
                .setUsername("mahsa_er")
                .setPassword("mahsa77")
                .setAge(21)
                .setAddress("iran tehran narmak")
                .setPhoneNum("9308251216")
                .setTahsilat("karshenasi");
        System.out.println("full name : "+builderPerson.getFullName());
        System.out.println("username : "+builderPerson.getUsername());
        System.out.println("password : "+builderPerson.getPassword());
        System.out.println("age : "+builderPerson.getAge());
        System.out.println("address: "+builderPerson.getAddress());
        System.out.println("phone number : "+builderPerson.getPhoneNum());
        System.out.println("tahsilat : "+builderPerson.getTahsilat());
    }
}
