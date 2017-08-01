package TheGameSpider.plugins.NoJoinMessages;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new mesage(), this);
		System.out.println("No join messages loaded");
		System.out.println("Plugin by TheGameSpider");
	}
	
	@Override
	public void onDisable(){
		System.out.println("No join messages unloaded");
	}	
	
}	

