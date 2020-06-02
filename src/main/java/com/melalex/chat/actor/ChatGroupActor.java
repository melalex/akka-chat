package com.melalex.chat.actor;

import akka.actor.AbstractActor;
import akka.actor.typed.ActorRef;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Receive;
import com.melalex.chat.annotation.Actor;
import lombok.Value;

import java.util.HashMap;
import java.util.Map;

@Actor
public class ChatGroupActor extends AbstractActor {

    private final Map<String, ActorRef> chats = new HashMap<>();

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(GetAllChatsCommand.class, command -> {
                })
                .match(LogInCommand.class, command -> {
                })
                .match(LogOutCommand.class, command -> {
                })
                .build();
    }

    @Value
    public static class GetAllChatsCommand {

        private int from;
        private int to;
    }

    @Value
    public static class LogInCommand {

        private String name;
    }


    @Value
    public static class LogOutCommand {

        private String name;
    }
}
