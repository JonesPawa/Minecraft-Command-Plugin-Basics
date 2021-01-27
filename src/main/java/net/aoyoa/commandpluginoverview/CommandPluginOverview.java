package net.aoyoa.commandpluginoverview;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandPluginOverview extends JavaPlugin {
    private static final String START_COMMAND = "Start";
    private static final String END_COMMAND = "End";

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Called when a command is entered
        if (command.getName().equalsIgnoreCase(START_COMMAND)) {
            System.out.println("Start");
            return true;

        } else if (command.getName().equalsIgnoreCase(END_COMMAND)) {
            System.out.println("End");
            return true;
        }
        return false;
    }
}
