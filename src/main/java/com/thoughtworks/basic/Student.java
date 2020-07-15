package com.thoughtworks.basic;

public class Student extends Person {
    Student(String name, String age, Class clas){
        super.setName(name);
        super.setAge(age);
        this.classNumber=clas.getClassNumber();
        this.clas=clas;
    }
    public String getClassNumber() {
        return classNumber;
    }

    public Class getClas() {
        return clas;
    }

    public void setClas(Class clas) {
        if(!clas.equals(this.clas)){
            this.clas.delStudent(this);
            this.clas.noticeAll(getName(),getAge(),clas.getClassNumber());
            clas.noticeAll(getName(),getAge(),clas.getClassNumber());
            clas.addStudent(this);
        }
        this.clas = clas;
    }

    private Class clas;
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public void setName(String name) {
        if(getName()!=name){
            super.setName(name);
            this.clas.noticeAll(name,getAge(),getClassNumber());
        }
    }

    private String classNumber;

    @Override
    public String introduce() {
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Student of Class "+getClassNumber();
    }

    @Override
    public void notice(String name,String age,String classNumber) {
        System.out.println("hi,"+getName()+",My name is "+name+". I am "+age+" years old. I am a student of Class "+classNumber+" now.");
    }
}
