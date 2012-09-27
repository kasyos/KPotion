package me.kasyos.kpotion;

import java.util.logging.Logger;

import me.kasyos.commandes.CommandeAquatique;
import me.kasyos.commandes.CommandeAveugle;
import me.kasyos.commandes.CommandeConfusion;
import me.kasyos.commandes.CommandeCoup;
import me.kasyos.commandes.CommandeDigslow;
import me.kasyos.commandes.CommandeDigspree;
import me.kasyos.commandes.CommandeFaiblesse;
import me.kasyos.commandes.CommandeFaim;
import me.kasyos.commandes.CommandeHasard;
import me.kasyos.commandes.CommandeKpotion;
import me.kasyos.commandes.CommandeLent;
import me.kasyos.commandes.CommandePoison;
import me.kasyos.commandes.CommandeRapide;
import me.kasyos.commandes.CommandeRegeneration;
import me.kasyos.commandes.CommandeResistance;
import me.kasyos.commandes.CommandeResistancefeu;
import me.kasyos.commandes.CommandeSaut;
import me.kasyos.commandes.CommandeSoin;

import org.bukkit.plugin.java.JavaPlugin;

public class MainKpotion extends JavaPlugin
{
	public Logger log;
	public CommandeKpotion kpotion;
	public CommandeHasard hasard;
	public CommandePoison poison;
	public CommandeConfusion confusion;
	public CommandeAveugle aveugle;
	public CommandeDigspree digspree;
	public CommandeResistance resistance;
	public CommandeResistancefeu resistancefeu;
	public CommandeCoup coup;
	public CommandeSoin soin;
	public CommandeFaim faim;
	public CommandeFaiblesse faiblesse;
	public CommandeSaut saut;
	public CommandeRegeneration regeneration;
	public CommandeLent lent;
	public CommandeDigslow digslow;
	public CommandeRapide rapide;
	public CommandeAquatique aquatique;
	
    @Override
	public void onEnable()
    {
    	this.getConfig().options().copyDefaults(true);
    	this.saveConfig();
    	
    	this.kpotion = new CommandeKpotion(this);
    	this.hasard = new CommandeHasard(this);
    	this.poison = new CommandePoison(this);
    	this.confusion = new CommandeConfusion(this);
    	this.aveugle = new CommandeAveugle(this);
    	this.digspree = new CommandeDigspree(this);
    	this.resistance = new CommandeResistance(this);
    	this.resistancefeu = new CommandeResistancefeu(this);
    	this.coup = new CommandeCoup(this);
       	this.soin = new CommandeSoin(this);
       	this.faim = new CommandeFaim(this);
       	this.faiblesse = new CommandeFaiblesse(this);
       	this.saut = new CommandeSaut(this);
       	this.regeneration = new CommandeRegeneration(this);
       	this.lent = new CommandeLent(this);
       	this.digslow = new CommandeDigslow(this);
       	this.rapide = new CommandeRapide(this);
       	this.aquatique = new CommandeAquatique(this);
    	
    	this.log = this.getLogger();
    	
    	getCommand("kpotion").setExecutor(kpotion);
    	getCommand("hasard").setExecutor(hasard);
    	getCommand("poison").setExecutor(poison);
    	getCommand("confusion").setExecutor(confusion);
    	getCommand("aveugle").setExecutor(aveugle);
    	getCommand("digspree").setExecutor(digspree);
    	getCommand("resistance").setExecutor(resistance);
    	getCommand("resistancefeu").setExecutor(resistancefeu);
    	getCommand("coup").setExecutor(coup);
    	getCommand("soin").setExecutor(soin);
    	getCommand("faim").setExecutor(faim);
    	getCommand("faiblesse").setExecutor(faiblesse);
    	getCommand("saut").setExecutor(saut);
    	getCommand("regeneration").setExecutor(regeneration);
    	getCommand("lent").setExecutor(lent);
    	getCommand("digslow").setExecutor(digslow);
    	getCommand("rapide").setExecutor(rapide);
    	getCommand("aquatique").setExecutor(aquatique);
    	
    	String infos = this.getDescription().getName() + 
    			" version "+ this.getDescription().getVersion() + 
    			" ecrit par " + this.getDescription().getAuthors().toString() +
    			" en cours d'activation !";
    	
    	log.info(infos);
    	
    	if (this.getConfig().getBoolean("MessagedeDepart.Activer"))
    	{
    		String msg = this.getConfig().getString("MessagedeDepart.Message");
    		log.info(msg);
    	}
    }
    
    
    @Override
    public void onDisable()
    {
    	if (this.getConfig().getBoolean("MessageArret.Activer"))
    	{
    		String msg = this.getConfig().getString("MessageArret.Message");
    		log.info(msg);
    	}
    }
    
    
}
