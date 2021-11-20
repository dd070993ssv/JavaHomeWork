package com.pb.susoev.hw8;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String s) {
        super(s);
    }
}