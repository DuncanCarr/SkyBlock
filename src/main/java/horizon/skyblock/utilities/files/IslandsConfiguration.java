package horizon.skyblock.utilities.files;

import horizon.skyblock.SkyBlock;
import horizon.skyblock.utilities.misc.Config;

public class IslandsConfiguration extends Config {

    public IslandsConfiguration() {
        super(SkyBlock.getInstance(), "islands.yml");
    }

}
