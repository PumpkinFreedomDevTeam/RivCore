package me.rivwhall05.RivCore.commands;

import java.util.logging.Logger;

import me.rivwhall05.RivCore.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class settabname
  implements CommandExecutor
{
  public Main plugin;
  
  public boolean onCommand(CommandSender sender, Command settabname, String s, String[] args)
  {
    Player p = (Player)sender;
	String name = p.getName();
    if (settabname.getName().equalsIgnoreCase("settabname")) {
      if (!(p instanceof Player))
      {
        this.plugin.logger.info("[RivCore] Only players can use that command.");
      }
      else
      {
          if(args.length == 0){
              
          sender.sendMessage(ChatColor.RED + " You must have text to set your tab name.");
         
          }
         
          if(args.length == 1){
         
             
              p.setPlayerListName(args[0]);
             
              }
        
      }
    }
    return false;
  }
}
