package us.redpvp.testing;

import org.bukkit.plugin.java.JavaPlugin;
import us.redpvp.testing.Commands.HelloCommand;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){

        getCommand("hello").setExecutor(new HelloCommand());

    }

}

