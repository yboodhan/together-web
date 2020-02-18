// The chat controller listens and responds with a message

package com.togetherweb.togetherweb.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    @MessageMapping("/chat")
    @SendTo("/messages")
    public BroadcastMessage send(Message message) throws Exception {
        return new BroadcastMessage(message.getAuthor(), message.getContent());
    }
}
