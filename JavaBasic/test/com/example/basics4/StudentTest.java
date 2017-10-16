/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class StudentTest {

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNames method, of class Student.
     */
    @Test
    public void testConstructor1() {
        System.out.println("testConstructor1");
        Student instance = new Student("Student Name", "I", "Engineer", "Sofia Univercity", "student@asd.bg", "0881234567");
        String expResult = "Student Name";
        String result = instance.getNames();
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of getNames method, of class Student.
//     */
//    @Test
//    public void testGetNames() {
//        System.out.println("getNames");
//        Student instance = new Student();
//        String expResult = null;
//        String result = instance.getNames();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setNames method, of class Student.
//     */
//    @Test
//    public void testSetNames() {
//        System.out.println("setNames");
//        String names = "";
//        Student instance = new Student();
//        instance.setNames(names);
//    }
//
//    /**
//     * Test of getCourse method, of class Student.
//     */
//    @Test
//    public void testGetCourse() {
//        System.out.println("getCourse");
//        Student instance = new Student();
//        String expResult = null;
//        String result = instance.getCourse();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setCourse method, of class Student.
//     */
//    @Test
//    public void testSetCourse() {
//        System.out.println("setCourse");
//        String course = "";
//        Student instance = new Student();
//        instance.setCourse(course);
//    }
//
//    /**
//     * Test of getSpecialty method, of class Student.
//     */
//    @Test
//    public void testGetSpecialty() {
//        System.out.println("getSpecialty");
//        Student instance = new Student();
//        String expResult = null;
//        String result = instance.getSpecialty();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setSpecialty method, of class Student.
//     */
//    @Test
//    public void testSetSpecialty() {
//        System.out.println("setSpecialty");
//        String specialty = "";
//        Student instance = new Student();
//        instance.setSpecialty(specialty);
//    }
//
//    /**
//     * Test of getUnivercity method, of class Student.
//     */
//    @Test
//    public void testGetUnivercity() {
//        System.out.println("getUnivercity");
//        Student instance = new Student();
//        String expResult = null;
//        String result = instance.getUnivercity();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setUnivercity method, of class Student.
//     */
//    @Test
//    public void testSetUnivercity() {
//        System.out.println("setUnivercity");
//        String univercity = "";
//        Student instance = new Student();
//        instance.setUnivercity(univercity);
//    }
//
//    /**
//     * Test of getMail method, of class Student.
//     */
//    @Test
//    public void testGetMail() {
//        System.out.println("getMail");
//        Student instance = new Student();
//        String expResult = null;
//        String result = instance.getMail();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setMail method, of class Student.
//     */
//    @Test
//    public void testSetMail() {
//        System.out.println("setMail");
//        String mail = "";
//        Student instance = new Student();
//        instance.setMail(mail);
//    }
//
//    /**
//     * Test of getPhoneNumber method, of class Student.
//     */
//    @Test
//    public void testGetPhoneNumber() {
//        System.out.println("getPhoneNumber");
//        Student instance = new Student();
//        String expResult = null;
//        String result = instance.getPhoneNumber();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setPhoneNumber method, of class Student.
//     */
//    @Test
//    public void testSetPhoneNumber() {
//        System.out.println("setPhoneNumber");
//        String phoneNumber = "";
//        Student instance = new Student();
//        instance.setPhoneNumber(phoneNumber);
//    }
//
//    /**
//     * Test of toString method, of class Student.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Student instance = new Student();
//        String expResult = null;
//        String result = instance.toString();
//        assertEquals(expResult, result);
//    }

}
