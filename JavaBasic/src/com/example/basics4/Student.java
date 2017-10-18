package com.example.basics4;

import java.util.Objects;

/**
 *
 * @author Student
 */
public class Student {

    private static int count = 0;

    private int studentId = 0;

    private String names = null;

    private Integer course = null;

    private String spec = null;

    private String univercity = null;

    private String mail = null;

    private String phoneNumber = null;

    public Student() {
        this.names = "Ivan Ivanov";
        this.course = 1;
        this.spec = "Engineer";
        this.univercity = "Sofia Univercity";
        this.mail = "ivan@gmail.com";
        this.phoneNumber = "+35988888888";
        addCount();
    }

    public Student(String names, Integer course, String spec) {
        this.names = names;
        this.course = course;
        this.spec = spec;
        addCount();
    }

    public Student(String names, Integer course, String mail, String phoneNumber) {
        this.names = names;
        this.course = course;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        addCount();
    }

    public Student(String names, Integer course, String spec, String univercity, String mail, String phoneNumber) {
        this.names = names;
        this.course = course;
        this.spec = spec;
        this.univercity = univercity;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        addCount();
    }

    public void addCount() {
        studentId = count + 1;
        count = studentId;
    }

    public int getCount() {
        return count;
    }

    public String getNames() {
        if (names == null) {
            return "";
        }
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getSpec() {
        if (spec == null) {
            return "";
        }
        return spec;
    }

    public void setSpecialty(String spec) {
        this.spec = spec;
    }

    public String getUnivercity() {
        if (univercity == null) {
            return "";
        }
        return univercity;
    }

    public void setUnivercity(String univercity) {
        this.univercity = univercity;
    }

    public String getMail() {
        if (mail == null) {
            return "";
        }
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        if (phoneNumber == null) {
            return "";
        }
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.names);
        hash = 53 * hash + Objects.hashCode(this.mail);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.names, other.names)) {
            return false;
        }
        return Objects.equals(this.mail, other.mail);
    }

    public void getInfoStudent() {
        System.out.println("Student No " + studentId + " information: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Names=" + getNames() + ",\ncourse=" + getCourse() + ",\nspec=" + getSpec() + ",\nunivercity=" + getUnivercity() + ",\nmail=" + getMail() + ",\nphoneNumber=" + getPhoneNumber() + "\n";
    }

}
