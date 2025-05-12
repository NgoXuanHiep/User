package com.mycompany.studentapp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void testGetName() {
        Student student = new Student("SV001", "Hiep", 20);
        Assert.assertEquals(student.getName(), "Hiep");
    }

    @Test
    public void testSetAge() {
        Student student = new Student("SV002", "Kiet", 19);
        student.setAge(21);
        Assert.assertEquals(student.getAge(), 21);
    }

    @Test
    public void testUpdateName() {
        Student student = new Student("SV003", "Huan", 18);
        student.updateName("Tran Huan");
        Assert.assertEquals(student.getName(), "Tran Huan");
    }
}