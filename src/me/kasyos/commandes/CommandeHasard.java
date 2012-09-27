package me.kasyos.commandes;

import java.util.Random;

import me.kasyos.kpotion.MainKpotion;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CommandeHasard implements CommandExecutor 
{

	private MainKpotion plugin;
	private Player p;
	
	public CommandeHasard(MainKpotion plugin)
	{
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,String[] args)
	{
		try
		{
			if (sender.hasPermission("kpotion.hasard"))
			{
				
			String nom = args[0];
			p = plugin.getServer().getPlayer(nom);
			Random random = new Random();
			int i = random.nextInt(16); // Récupère un nombre entier entre 0 et 16
		    if(i==0)
		    {
				int aquatique = plugin.getConfig().getInt("TempsPotion.Aquatique");
				p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, aquatique, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion aquatique est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion aquatique pendant : " + aquatique);
		    }
		    if(i==1)
	    	{
				int aveugle = plugin.getConfig().getInt("TempsPotion.Aveugle");
				p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, aveugle, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion d'aveuglement est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion d'aveuglement pendant : " + aveugle);
	    	}
		    if(i==2)
    	    {
				int confusion = plugin.getConfig().getInt("TempsPotion.Confusion");
				p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, confusion, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de confusion est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de confusion pendant : " + confusion);
    	    }
		    if(i==3)
    	    {
				int coup = plugin.getConfig().getInt("TempsPotion.Coup");
				p.addPotionEffect(new PotionEffect(PotionEffectType.HARM, coup, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de coup est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de coup pendant : " + coup);
    	    }
		    if(i==4)
    	    {
				int digslow = plugin.getConfig().getInt("TempsPotion.Digslow");
				p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, digslow, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de digslow est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de digslow pendant : " + digslow);
    	    }
		    if(i==5)
    	    {
				int digspree = plugin.getConfig().getInt("TempsPotion.Digspree");
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, digspree, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de digspree est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de digspree pendant : " + digspree);
    	    }
		    if(i==6)
    	    {
				int faiblesse = plugin.getConfig().getInt("TempsPotion.Faiblesse");
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, faiblesse, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de faiblesse est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de faiblesse pendant : " + faiblesse);
    	    }
		    if(i==7)
    	    {
				int faim = plugin.getConfig().getInt("TempsPotion.Faim");
				p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, faim, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de faim est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de faim pendant : " + faim);
    	    }
		    if(i==8)
    	    {
				int lent = plugin.getConfig().getInt("TempsPotion.Lent");
				p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, lent, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de lenteur est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de lenteur pendant : " + lent);
    	    }
		    if(i==9)
    	    {
				int poison = plugin.getConfig().getInt("TempsPotion.Poison");
				p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, poison, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de poison est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de poison pendant : " + poison);
    	    }
		    if(i==10)
    	    {
				int rapide = plugin.getConfig().getInt("TempsPotion.Rapide");
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, rapide, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de vitesse est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de vitesse pendant : " + rapide);
    	    }
		    if(i==11)
    	    {
				int regeneration = plugin.getConfig().getInt("TempsPotion.Regeneration");
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, regeneration, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de regeneration est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de regeneration pendant : " + regeneration);
    	    }
		    if(i==12)
    	    {
				int resistance = plugin.getConfig().getInt("TempsPotion.Resistance");
				p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, resistance, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de resistance est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de resistance pendant : " + resistance);
    	    }
		    if(i==13)
    	    {
				int resistancefeu = plugin.getConfig().getInt("TempsPotion.ResistanceFeu");
				p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, resistancefeu, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de resistance feu est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de resistance feu pendant : " + resistancefeu);
    	    }
		    if(i==14)
    	    {
				int saut = plugin.getConfig().getInt("TempsPotion.Saut");
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, saut, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de saut est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de saut pendant : " + saut);
    	    }
		    if(i==15)
    	    {
				int soin = plugin.getConfig().getInt("TempsPotion.Soin");
				p.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, soin, 1));
				sender.sendMessage(ChatColor.AQUA + "[KPotion] La potion de soin est envoyer sur " + ChatColor.YELLOW + nom);
				p.sendMessage(ChatColor.AQUA + "Vous avez reçu une potion de soin pendant : " + soin);
    	    }

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