package com.example.interfaces;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Student
 */
public class EventResult {

    private String eventTime = "";
    private long eventId = 0;

    public EventResult() {
        this.eventTime = new Date().toString();
        this.eventId = new Random().nextLong();
    }

    void getInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "EventResult{" + "eventTime=" + eventTime + ", eventId=" + eventId + '}';
    }

}
