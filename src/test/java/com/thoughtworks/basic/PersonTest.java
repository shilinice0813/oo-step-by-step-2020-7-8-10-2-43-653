package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void test_Person_Introduce(){
        Person person =new Person();
        person.setAge("11");
        person.setName("Tom");
        assertEquals (person.introduce(),"My name is Tom. I am 11 years old.");
    }
}
