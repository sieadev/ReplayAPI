package siea.dev.replayapi;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import siea.dev.replayapi.storage.StorageManager;

public final class ReplayAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        StorageManager storageManager = new StorageManager(this);
        for (Player player : getServer().getOnlinePlayers()){

        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
