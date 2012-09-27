package me.kasyos.commandes;

import me.kasyos.kpotion.MainKpotion;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandeKpotion implements CommandExecutor 
{

	public CommandeKpotion(MainKpotion plugin)
	{
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,String[] args)
	{
		try
		{
			if (sender.hasPermission("kpotion.kpotion"))
			{
			sender.sendMessage(ChatColor.YELLOW + "------| KPotion Aide |------------");
			sender.sendMessage(ChatColor.DARK_AQUA + "Utilisation : " + ChatColor.YELLOW + "/<potion> <joueur>");
			sender.sendMessage(ChatColor.DARK_AQUA + "Liste des potions :");
			sender.sendMessage(ChatColor.AQUA + " aquatique - aveugle - confusion - coup - digslow - digspree - faiblesse - faim - lent - poison - rapide " +
					"- regeneration - resistance - resistancefeu - saut - soin");
			sender.sendMessage(ChatColor.DARK_AQUA + "Vous ne savez quelle potion prendre ? : " + ChatColor.YELLOW + "/hasard <joueur>");
			sender.sendMessage(ChatColor.YELLOW + "------| Kpotion par kasyos |------");
			
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
