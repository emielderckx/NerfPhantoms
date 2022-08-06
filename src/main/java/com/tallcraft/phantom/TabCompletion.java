package com.tallcraft.phantom;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class TabCompletion implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("phantom") && args.length == 1) {
            List<String> list = new ArrayList<>();
            list.add("help");

            if (sender.hasPermission("phantom.disablespawn.self")) {
                list.add("toggle");
            }

            if (sender.hasPermission("phantom.reload")) {
                list.add("reload");
            }

            if (sender.hasPermission("phantom.kill")) {
                list.add("kill");
            }

            return list;
        }
        List<String> list = new ArrayList<>();
        for (Player p : Bukkit.getOnlinePlayers()) {
            list.add(p.getName());
        }
        return list;
    }
}