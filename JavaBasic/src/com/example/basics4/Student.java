/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics4;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Student {

    private String names = null;

    private String course = null;

    private String specialty = null;

    private String univercity = null;

    private String mail = null;

    private String phoneNumber = null;
    
    private String mmmm = null;
  
    private String newm = null;

    public void setNewm(String newm) {
        this.newm = newm;
    }
    
    public Student(String names, String course, String specialty) {
        this.names = names;
        this.course = course;
        this.specialty = specialty;
    }

    public Student(String names, String course, String mail, String phoneNumber) {
        this.names = names;
        this.course = course;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public Student(String names, String course, String specialty, String univercity, String mail, String phoneNumber) {
        this.names = names;
        this.course = course;
        this.specialty = specialty;
        this.univercity = univercity;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
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

    public String getMmmm() {
        return mmmm;
    }
    
    public String getCourse() {
        if (course == null) {
            return "";
        }
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSpecialty() {
        if (specialty == null) {
            return "";
        }
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
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
    
    @Override
    public String toString() {
        return "Student{" + "names=" + getNames() + ", course=" + getCourse() + ", specialty=" + getSpecialty() + ", univercity=" + getUnivercity() + ", mail=" + getMail() + ", phoneNumber=" + getPhoneNumber() + '}';
    }

    public void setMmmm(String mmmm) {
        this.mmmm = mmmm;
    }

}
