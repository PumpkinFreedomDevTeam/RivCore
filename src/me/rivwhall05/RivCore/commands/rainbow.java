package me.rivwhall05.RivCore.commands;

import java.util.logging.Logger;

import me.rivwhall05.RivCore.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rainbow
  implements CommandExecutor
{
  public Main plugin;
  
  public boolean onCommand(CommandSender sender, Command rainbow, String s, String[] args3)
  {
    Player p = (Player)sender;
    if (rainbow.getName().equalsIgnoreCase("rainbow")) {
      if (!(p instanceof Player))
      {
        this.plugin.logger.info("[GamingCube Help] Only players can use that command.");
      }
      else
      {
        p.sendMessage(ChatColor.RED + "R" + ChatColor.GREEN + "a" + ChatColor.AQUA + "i" + ChatColor.BLUE + "n" + ChatColor.GOLD + "b" + ChatColor.YELLOW + "o" + ChatColor.DARK_AQUA + "w" + ChatColor.DARK_PURPLE + "!");
        
      }
    }
    return false;
  }
}
