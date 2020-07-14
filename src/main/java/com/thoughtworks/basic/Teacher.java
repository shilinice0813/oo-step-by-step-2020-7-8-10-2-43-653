package com.thoughtworks.basic;

public class Teacher extends Person {

    public Teacher(String name,String age){
        super.setName(name);
        super.setAge(age);
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private String job;

    @Override
    public String introduce() {
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher.";
    }

    @Override
    public void notice(String name,String age,String classNumber) {
        System.out.println("hi,"+getName()+",My name is "+name+". I am "+age+" years old. I am a student of Class "+classNumber+" now.");
    }
}
