package horizon.skyblock;

import horizon.skyblock.utilities.files.IslandsConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyBlock extends JavaPlugin {

    private static SkyBlock instance;
    private IslandsConfiguration islandsConfiguration;

    @Override
    public void onEnable() {
        instance = this;

        // Configuration Files
        islandsConfiguration = new IslandsConfiguration();
    }

    public static SkyBlock getInstance() {
        return instance;
    }
    public IslandsConfiguration getIslandsConfiguration() {
        return islandsConfiguration;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
