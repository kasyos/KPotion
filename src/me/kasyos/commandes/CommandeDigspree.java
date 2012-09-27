package me.kasyos.commandes;

import me.kasyos.kpotion.MainKpotion;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CommandeDigspree implements CommandExecutor 
{

	private MainKpotion plugin;
	private Player p;
	
	public CommandeDigspree(MainKpotion plugin)
	{
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) 
	{
		try
		{
			if (sender.hasPermission("kpotion.digspree"))
			{
			
			String nom = args[0];
			p = plugin.getServer().getPlayer(nom);
			int digspree = plugin.getConfig().getInt("TempsPotion.Digspree");
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, digspree, 1));
			sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de digspree est envoyer sur " + ChatColor.YELLOW + nom);
			p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de digspree pendant : " + digspree);
			
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