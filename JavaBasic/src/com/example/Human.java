package com.example;

import java.util.Objects;

/**
 *
 * @author Student
 */
public class Human {
    
    private String firstName;
    
    private String lastName;

    public Human() {
    }

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.firstName);
        hash = 53 * hash + Objects.hashCode(this.lastName);
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
        final Human other = (Human) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        return Objects.equals(this.lastName, other.lastName);
    }

    
    
    @Override
    public String toString() {
        return "Human{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }

}
