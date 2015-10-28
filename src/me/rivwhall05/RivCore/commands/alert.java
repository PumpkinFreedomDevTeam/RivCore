package me.rivwhall05.RivCore.commands;

import java.util.logging.Logger;

import me.rivwhall05.RivCore.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class alert
  implements CommandExecutor
{
  public Main plugin;
  
	public boolean onCommand(CommandSender sender, Command command, String cmd,
			String[] args) {
		if (cmd.equalsIgnoreCase("alert")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("For players only.. k.");

			} else {
				Player p = (Player) sender;
				if (!p.hasPermission("rivcore.alert")) {
					p.sendMessage(ChatColor.DARK_RED
							+ "You do not have access to that command!");

				} else if (args.length == 0) {
					p.sendMessage(ChatColor.DARK_RED + "You need to type in a message!");
				} else {
					Bukkit.broadcastMessage(ChatColor.RED + "PumpkinFreedom: " + ChatColor.GREEN + message(args));
				}

			}
		}
		return false;
	}
	public String message(String[] args) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
		builder.append(args[i]);
		builder.append(" ");
		}
		return builder.toString().trim();
	}
}
