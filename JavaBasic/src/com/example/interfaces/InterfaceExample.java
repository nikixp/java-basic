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

        Messanger callback = new Messanger(new EventResult("doCallback 123"), new CallBackListener() {
            @Override
            public void callback(EventResult eventResult) {
                eventResult.getInfo();
            }
        });

        callback.doCallback();

        Messanger notify = new Messanger(new EventResult("doNotify "), new NotificationListener() {
            @Override
            public void notify(EventResult eventResult) {
                eventResult.getInfo();
            }
        });
        notify.doNotify();
    }

}
