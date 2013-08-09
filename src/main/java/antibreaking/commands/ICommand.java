package antibreaking.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.Map;

/**
 * Basic Command Interface
 *
 * @author Relicum
 * @version 0.1
 */
public abstract class ICommand {

    public Map<String, String> cmap = new HashMap<String,String>();
    public String perm;
    public String permMessage;
    public Integer numArgs;
    public String description;
    public String label;
    public String usage;
    public String cmd;


    public ICommand(){


    }


    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
