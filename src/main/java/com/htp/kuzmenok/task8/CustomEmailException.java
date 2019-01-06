package com.htp.kuzmenok.task8;

public class CustomEmailException extends Exception {
    private String customEmailMessage;

    CustomEmailException(String s) {
        customEmailMessage = this.getMessage() + s;
    }

    public String getCustomMessage() {return customEmailMessage;}

    @Override
    public String toString() {
        return super.toString() + customEmailMessage;
    }
}
