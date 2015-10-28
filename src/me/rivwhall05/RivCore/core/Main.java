package me.rivwhall05.RivCore.core;

import java.util.logging.Logger;

import me.rivwhall05.RivCore.commands.dogelover;
import me.rivwhall05.RivCore.commands.lol;
import me.rivwhall05.RivCore.commands.rainbow;
import me.rivwhall05.RivCore.commands.say;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
{
  public final Logger logger = Logger.getLogger("Minecraft");
  public Main plugin;
  
  public void onEnable()
  {
    PluginDescriptionFile pdfFile = getDescription();
    this.logger.info("RivCore has been enabled!");
    getCommand("say").setExecutor(new say());;
    getCommand("lol").setExecutor(new lol());;
    getCommand("rainbow").setExecutor(new rainbow());;
    getCommand("lovedoge").setExecutor(new dogelover());;
  }
  
  public void onDisable()
  {
    PluginDescriptionFile pdfFile = getDescription();
    this.logger.info("RivCore has been disabled!");
  }
}
