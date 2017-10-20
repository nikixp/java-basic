package com.example.clones;

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
        return (ClonableObject) super.clone();
    }

}
