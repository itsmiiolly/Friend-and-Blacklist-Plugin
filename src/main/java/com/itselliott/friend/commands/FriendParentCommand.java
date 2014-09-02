package com.itselliott.friend.commands;

import org.bukkit.command.CommandSender;

import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import com.sk89q.minecraft.util.commands.CommandException;
import com.sk89q.minecraft.util.commands.NestedCommand;

public class FriendParentCommand {

    @Command(
    		aliases = {"friend"}, 
    		desc = "Commands for the friends and blacklist plugin", 
    		min = 0, 
    		max = -1)
    @NestedCommand({FriendCommands.class})
    public static void friend(CommandContext args, CommandSender sender) throws CommandException {
    }
}