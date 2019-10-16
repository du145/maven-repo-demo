package com.du.config;

public class HelloService {

    private String prefix;

    private String suffix;

    public HelloService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String say(String text) {
        return String.format("%s , hi , %s , %s", prefix, text, suffix);
    }

}
