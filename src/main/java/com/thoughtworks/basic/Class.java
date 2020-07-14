package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String classNumber;
    public Class(String classNumber){
        this.classNumber=classNumber;
    }

    public Person getTeacher() {
        return teacher;
    }
    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }


    public List<Person> getStudents() {
        return students;
    }

    public void setStudents(List<Person> students) {
        this.students = students;
    }



    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Person student) {
        this.students.add(student);
    }

    public void delStudent(Person student) {
        this.students.remove(student);
    }

    private List<Person> students=new ArrayList<Person>();
    private Person teacher=new Person();

    public void noticeAll(String name,String age,String classNumber) {
        for (Person s: this.students
             ) {
            if(s.getName().equals(name)){
                continue;
            }
            s.notice(name,age,classNumber);
        }
        this.teacher.notice(name,age,classNumber);
    }
}
