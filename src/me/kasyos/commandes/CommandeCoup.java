package me.kasyos.commandes;

import me.kasyos.kpotion.MainKpotion;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CommandeCoup implements CommandExecutor
{
	private MainKpotion plugin;
	private Player p;
	
	public CommandeCoup(MainKpotion plugin)
	{
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) 
	{
		try
		{
			if (sender.hasPermission("kpotion.coup"))
			{
				
			String nom = args[0];
			p = plugin.getServer().getPlayer(nom);
			int coup = plugin.getConfig().getInt("TempsPotion.Coup");
			p.addPotionEffect(new PotionEffect(PotionEffectType.HARM, coup, 1));
			sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de coup est envoyer sur " + ChatColor.YELLOW + nom);
			p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de coup pendant : " + coup);
			
			}
			else
			{
				sender.sendMessage(ChatColor.RED + "[KPotion] Vous n'avez pas la permission de faire cela !");
			}
			
		}
 		catch(Exception e)
       {
    			String aide = command.getDescription() + " : " + command.getUsage();
    			sender.sendMessage(aide);
    			return true;
    	}
		

		return true;
	}

}