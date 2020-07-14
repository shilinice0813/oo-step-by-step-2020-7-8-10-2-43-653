package com.thoughtworks.basic;

public class Person {
    private String age;
    private String name;
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
    public String introduce(){
        return "My name is "+getName()+". I am "+getAge()+" years old.";
    }
    public void notice(String name,String age,String classNumber){

    }
}
