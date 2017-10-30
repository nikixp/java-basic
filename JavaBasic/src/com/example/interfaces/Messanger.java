package com.example.interfaces;

/**
 *
 * @author Student
 */
public class Messanger {

    public EventResult sEventResult;
    public String message;
    
    private CallBackListener mCallback;
    private NotificationListener mNotify;

    public Messanger(EventResult eventResult, CallBackListener callback) {
        this.mCallback = callback;
        this.sEventResult = eventResult;
    }
    
    public Messanger(EventResult eventResult, NotificationListener notify) {
        this.mNotify = notify;
        this.sEventResult = eventResult;
    }

    public void doCallback() {
        if (mCallback != null) {
            mCallback.callback(sEventResult);
        }
    }
    
    public void doNotify(){
        if (mNotify != null) {
            mNotify.notify(sEventResult);
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
