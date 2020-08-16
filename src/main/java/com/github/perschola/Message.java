package com.github.perschola;

public class Message {



    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    Message(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }


}

