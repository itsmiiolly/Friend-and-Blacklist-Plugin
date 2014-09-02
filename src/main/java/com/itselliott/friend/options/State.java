package com.itselliott.friend.options;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.itselliott.friend.Configuration;

/**
 * Created by Elliott on 29/08/2014.
 */
public class State {

    public static void StateMessage(Player from, StateType state, Player to) {
        String message = ChatColor.GOLD + "";
        switch (state) {
            case INVALID_PLAYER:
                message += "Player not found";
                break;
            case SENT_REQUEST:
                message += "Sent friend request to" + to.getDisplayName();
                Configuration.pendingFriend(from.getName(), to.getName());
                break;
            case RECIVED_REQUEST:
                message += from.getDisplayName() + " has sent your a friend request! \n"
                        + ChatColor.RED + "/friend deny " + from.getDisplayName() + "\n" + ChatColor.GREEN + "/friend accept " + from.getDisplayName();
                break;
            case REQUEST_ACCEPTED:
                message += to.getDisplayName() + " has accepted your friend request!";
                Configuration.acceptFriend(to.getName(), from.getName());
                break;
            case ACCEPTED_REQUEST:
                message += "You accepted " + to.getDisplayName() + " friend request";
                Configuration.acceptFriend(from.getName(), to.getName());
                break;
            case REQUEST_DENIED:
                message += to.getDisplayName() + " has denied your friend request";
                Configuration.denyFriend(from.getName(), to.getName());
                break;
            case DENIED_REQUEST:
                message += "You denied a friend request from" + to.getDisplayName();
                break;
        }
        from.sendMessage(message);
    }
    public enum StateType {
        SENT_REQUEST,RECIVED_REQUEST,REQUEST_ACCEPTED,REQUEST_DENIED,ACCEPTED_REQUEST, DENIED_REQUEST, INVALID_PLAYER;
    }
}



