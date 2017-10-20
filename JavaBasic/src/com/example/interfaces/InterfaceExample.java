package com.example.interfaces;

/**
 *
 * @author Student
 */
public class InterfaceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Messanger messanger = new Messanger(new CallBackListener() {
            @Override
            public void callback(EventResult eventResult) {
                eventResult.getInfo();
            }
        });
        messanger.doCallback();
    }
    
}
