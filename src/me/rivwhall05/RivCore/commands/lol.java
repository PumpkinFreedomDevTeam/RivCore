package me.rivwhall05.RivCore.commands;

import java.util.logging.Logger;

import me.rivwhall05.RivCore.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class lol
  implements CommandExecutor
{
  public Main plugin;
  
  public boolean onCommand(CommandSender sender, Command lol, String s, String[] args3)
  {
    Player p = (Player)sender;
	String name = p.getName();
    if (lol.getName().equalsIgnoreCase("lol")) {
      if (!(p instanceof Player))
      {
        this.plugin.logger.info("[RivCore] Only players can use that command.");
      }
      else
      {
        Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + name + ChatColor.DARK_RED + " Is a big fat loller!" + ChatColor.GOLD + " He is being a bitch and looling around being a complete idiot! he is fucking around too! GET OUT OF THE FUCKING WAY!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
      }
    }
    return false;
  }
}
