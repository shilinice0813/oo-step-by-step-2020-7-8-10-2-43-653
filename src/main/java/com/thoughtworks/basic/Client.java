package com.thoughtworks.basic;

public class Client {
    public static void main(String[] args) {
        Class clas=new Class("1");
        Person student=new Student("Tom","23",clas);
        Person student1=new Student("Jom","24",clas);
        Person student2=new Student("sss","25",clas);
        Person student3=new Student("xxx","26",clas);
        Person student4=new Student("www","27",clas);
        Person teacher=new Teacher("luoli","35");
        clas.addStudent(student);
        clas.addStudent(student1);
        clas.addStudent(student2);
        clas.addStudent(student3);
        clas.addStudent(student4);
        clas.setTeacher(teacher);
        //student1.setName("张飞");
        ((Student) student1).setClassNumber("2");
    }
}
