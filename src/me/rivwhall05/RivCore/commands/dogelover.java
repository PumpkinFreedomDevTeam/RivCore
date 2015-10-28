package me.rivwhall05.RivCore.commands;

import java.util.logging.Logger;

import me.rivwhall05.RivCore.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class dogelover
  implements CommandExecutor
{
  public Main plugin;
  
  public boolean onCommand(CommandSender sender, Command lovedoge, String s, String[] args3)
  {
    Player p = (Player)sender;
	String name = p.getName();
    if (lovedoge.getName().equalsIgnoreCase("lovedoge")) {
      if (!(p instanceof Player))
      {
        this.plugin.logger.info("[GamingCube Help] Only players can use that command.");
      }
      else
      {
        Bukkit.broadcastMessage(ChatColor.DARK_RED + name + ChatColor.DARK_RED + " Loves Doge YAAAAAAY!");
        
      }
    }
    return false;
  }
}
