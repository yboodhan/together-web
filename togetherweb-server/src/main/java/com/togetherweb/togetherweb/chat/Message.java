// This is the structure of the message that will be received from the client

package com.togetherweb.togetherweb.chat;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {

    private String author;
    private String content;

    Message() {}

    public Message(String author,String content)
    {
        this.author = author;
        this.content = content;
    }

}
