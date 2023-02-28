package fr.Alex.pluginrpg;

import fr.Alex.pluginrpg.utils.Managers;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginRpgMain extends JavaPlugin {
    @Override
    public void onEnable() {
        Managers.load();
    }

    @Override
    public void onDisable() {
        Managers.unload();

    }
}
}
