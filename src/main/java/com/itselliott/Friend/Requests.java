package com.itselliott.Friend;

import org.bukkit.entity.Player;

/**
 * Created by Elliott on 29/08/2014.
 */
public class Requests {

    public static void send(Player sender, Player to){
        State.StateMessage(sender, State.StateType.SENT_REQUEST, to);
        State.StateMessage(to, State.StateType.RECIVED_REQUEST, sender);
    }

    public static void accpet(Player sender, Player to){
        State.StateMessage(sender, State.StateType.REQUEST_ACCEPTED, to);
        State.StateMessage(to, State.StateType.REQUEST_ACCEPTED, sender);
    }

    public static void deny(Player sender, Player to){
        State.StateMessage(to, State.StateType.DENIED_REQUEST, sender);
    }

}
