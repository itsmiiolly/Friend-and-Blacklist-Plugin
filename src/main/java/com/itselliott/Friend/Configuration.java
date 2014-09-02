package com.itselliott.Friend;

import org.bukkit.plugin.Plugin;

/**
 * Created by Elliott on 29/08/2014.
 */
public class Configuration {

    static Plugin plugin;

    public static void Config(Plugin p){
        plugin = p;
    }


    public static void pendingFriend(String from, String to){
        plugin.getConfig().set(from + ".Friends.Pending", plugin.getConfig().getStringList(from + ".Friends.Pending").add(to));
    }

    public static void acceptFriend(String from, String to){
        plugin.getConfig().set(from + ".Friends.Accepted", plugin.getConfig().getStringList(from + ".Friends.Accepted").add(to));
        plugin.getConfig().set(from + ".Friends.Pending", plugin.getConfig().getStringList(from + ".Friends.Pending").remove(to));
    }

    public static void denyFriend(String from, String to){
        plugin.getConfig().set(from + ".Friends.Pending", plugin.getConfig().getStringList(from + ".Friends.Pending").remove(to));
    }
}
