package com.company;

public class BuilderPerson {

    private String fullName;
    private String username;
    private String password;
    private int age;
    private String address;
    private String phoneNum;
    private String tahsilat;



    public BuilderPerson (int age, String fullname, String username,String password,String address,String phoneNum,String tahsilat) {

        this.fullName = fullName;
        this.username = username;
        this.password=password;
        this.age = age;
        this.address=address;
        this.phoneNum=phoneNum;
        this.tahsilat=tahsilat;
    }

    public BuilderPerson (){}

    public String getFullName () {
        return fullName;
    }

    public BuilderPerson setFullName (String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getUsername () { return username; }

    public BuilderPerson setUsername (String username) {
        this.username = username;
        return this;
    }

    public String getPassword () {
        return password;
    }

    public BuilderPerson setPassword (String username) {
        this.username = username;
        return this;
    }

    public int getAge () {
        return age;
    }

    public BuilderPerson setAge (int age) {
        this.age = age;
        return this;
    }

    public String getAddress() { return address; }

    public BuilderPerson setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNum() { return phoneNum; }

    public BuilderPerson setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    public String getTahsilat() { return tahsilat; }

    public BuilderPerson setTahsilat(String tahsilat) {
        this.tahsilat = tahsilat;
        return this;
    }
}
