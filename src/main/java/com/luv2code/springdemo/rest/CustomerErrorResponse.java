package com.luv2code.springdemo.rest;

/**
 * Created by prakashdas on 15/08/18.
 */
public class CustomerErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

    public CustomerErrorResponse(){

    }

    public CustomerErrorResponse(int status, String message, long timeStamp){
        this.message=message;
        this.status=status;
        this.timeStamp=timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
