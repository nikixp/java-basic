package com.example.clones;

import java.util.Objects;

/**
 *
 * @author Student
 */
public class ClonableObject implements Cloneable {

    public String s;
    public int i;

    public ClonableObject(String s, int i) {
        this.s = s;
        this.i = i;
    }

    @Override
    public String toString() {
        return "ClonableObject{" + "s=" + s + ", i=" + i + '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.s);
        hash = 29 * hash + this.i;
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
        final ClonableObject other = (ClonableObject) obj;
        if (this.i != other.i) {
            return false;
        }
        if (!Objects.equals(this.s, other.s)) {
            return false;
        }
        return true;
    }
    
}
