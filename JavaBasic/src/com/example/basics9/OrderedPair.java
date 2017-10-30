package com.example.basics9;

/**
 *
 * @author Student
 */
public class OrderedPair implements Pair<Integer, String>{

    private Integer key;
    private String value;

    public OrderedPair(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
    
    @Override
    public Integer getKey() {
        return key;
    }

    @Override
    public String getVelue() {
        return value;
    }

}
