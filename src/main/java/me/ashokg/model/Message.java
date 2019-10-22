package me.ashokg.model;

import lombok.Data;

@Data
public class Message {
    private String name;
    public Message(String name) {
        this.name = name + ", thanks so much for clicking the button! You really do love me!";
    }
}