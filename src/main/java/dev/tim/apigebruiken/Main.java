package dev.tim.apigebruiken;

import dev.tim.apigebruiken.commands.GUICommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        // Commands
        getCommand("gui").setExecutor(new GUICommand());

    }

}
