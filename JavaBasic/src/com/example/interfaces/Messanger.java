package com.example.interfaces;

/**
 *
 * @author Student
 */
public class Messanger {

    public CallBackListener mCallback;

    public Messanger(CallBackListener callback) {
        this.mCallback = callback;
    }

    public void doCallback() {
        if (mCallback != null) {
            mCallback.callback(new EventResult());
        }
    }

}
