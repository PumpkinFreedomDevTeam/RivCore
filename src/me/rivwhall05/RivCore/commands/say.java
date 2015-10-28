package me.rivwhall05.RivCore.commands;

import java.util.logging.Logger;

import me.rivwhall05.RivCore.core.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class say
  implements CommandExecutor
{
  public Main plugin;

  @Override
  public boolean onCommand(CommandSender sender, Command say, String s, String[] args3)
  {
    Player p = (Player)sender;
	String name = p.getName();
    if (say.getName().equalsIgnoreCase("say")) {
      if (!(p instanceof Player))
      {
        this.plugin.logger.info("RivCore Only players can use that command.");
      }
      else
      {
        p.sendMessage(ChatColor.DARK_RED + "This command is blocked. If you are a staff member please use /broadcast. Thank you");
        
      }
    }
    return false;
  }
}
