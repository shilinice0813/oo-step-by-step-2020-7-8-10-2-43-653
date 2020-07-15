package com.thoughtworks.basic;

public class Client {
    public static void main(String[] args) {
        Class clas1=new Class("1");
        Class clas2=new Class("2");
        Person student=new Student("Tom","23",clas1);
        Person student1=new Student("Jom","24",clas1);
        Person student2=new Student("sss","25",clas1);
        Person student3=new Student("xxx","26",clas1);
        Person student4=new Student("www","27",clas1);
        Person teacher=new Teacher("luoli","35");

        Person student5=new Student("qqq","23",clas2);
        Person student6=new Student("www","24",clas2);
        Person student7=new Student("eee","25",clas2);

        clas2.addStudent(student5);
        clas2.addStudent(student6);
        clas2.addStudent(student7);

        clas1.addStudent(student);
        clas1.addStudent(student1);
        clas1.addStudent(student2);
        clas1.addStudent(student3);
        clas1.addStudent(student4);
        clas1.setTeacher(teacher);
        student1.setName("张飞");
        //((Student) student1).setClas(clas2);
    }
}
