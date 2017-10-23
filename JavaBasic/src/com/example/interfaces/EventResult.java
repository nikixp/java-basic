package com.example.interfaces;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Student
 */
public class EventResult {

    private String name = "";
    private String eventTime = "";
    private long eventId = 0;

    public EventResult(String name) {
        this.eventTime = new Date().toString();
        this.eventId = new Random().nextLong();
        this.name = name;
    }

    void getInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return name + "{" + "eventTime=" + eventTime + ", eventId=" + eventId + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
