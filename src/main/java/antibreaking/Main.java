package antibreaking;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Antibreaking
 *
 * @author Relicum
 * @version 0.1
 */
public class Main extends JavaPlugin implements Listener {

    /**
     * Static instance of itself
     */
    public static Main instance = null;

    /**
     * Non Static instance of itself
     */
    Main main;
    public void onLoad(){
       main = this;
    }

    public Main set(Main ma){

        if(instance != null){
            return instance;
        }

        this.saveDefaultConfig();
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();

        instance = ma;
        return instance;

    }

    public void onDisable(){


    }

    @EventHandler (priority= EventPriority.HIGHEST,ignoreCancelled = true)
    public void placeEvent(BlockBreakEvent e){

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void BreakEvent (BlockBreakEvent e){


    }
}
