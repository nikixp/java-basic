package com.example.basics3;

/**
 *
 * @author Student
 */
public class Student {

    private String firstName = "";

    private String surName = "";

    private String familyName = "";

    private String course = "";

    private String spec = "";

    private String univercity = "";

    private String email = "";

    private String phone = "";

    public Student() {
    }

    public Student(String firstName, String surName, String familyName, String email, String phone) {
        this.firstName = firstName;
        this.surName = surName;
        this.familyName = familyName;
        this.course = "";
        this.spec = "";
        this.univercity = "";
        this.email = email;
        this.phone = phone;
    }

    public Student(String firstName, String surName, String familyName, String course, String spec, String univercity, String email, String phone) {
        this.firstName = firstName;
        this.surName = surName;
        this.familyName = familyName;
        this.course = course;
        this.spec = spec;
        this.univercity = univercity;
        this.email = email;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUnivercity() {
        return univercity;
    }

    public void setUnivercity(String univercity) {
        this.univercity = univercity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", surName=" + surName + ", familyName=" + familyName + ", course=" + course + ", spec=" + spec + ", univercity=" + univercity + ", email=" + email + ", phone=" + phone + '}';
    }

}
