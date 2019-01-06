package com.htp.kuzmenok.task8;

public class CustomLoginException extends Exception {
    private String customLoginMessage;

    CustomLoginException(String s) {
        customLoginMessage = this.getMessage() + s;
    }

    public String getCustomLoginMessage() {return customLoginMessage;}

    @Override
    public String toString() {return super.toString() + customLoginMessage;}

}

