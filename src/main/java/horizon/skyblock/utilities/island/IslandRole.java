package horizon.skyblock.utilities.island;

import horizon.skyblock.SkyBlock;

import java.util.ArrayList;
import java.util.Arrays;

public enum IslandRole {

    VISITOR(),
    MEMBER(),
    MODERATOR(),
    OPERATOR(),
    OWNER(IslandPermission.ALL);

    private ArrayList<IslandPermission> permissionArrayList;
    private final PermissionUtil permissionUtil = new PermissionUtil();

    IslandRole(IslandPermission... permissions) {
        permissionArrayList = (ArrayList<IslandPermission>) Arrays.asList(permissions);
    }

    public ArrayList<IslandPermission> getPermissions(Island island) {
        return island.getPermissions(this);
    }

    public void setPermissions(Island island, IslandPermission... permissions) {
        permissionArrayList = (ArrayList<IslandPermission>) Arrays.asList(permissions);
    }

    public void addPermission(Island island, IslandPermission... permissions) {
        for (IslandPermission permission : permissions) {
            if (getPermissions(island).contains(permission)) {
                continue;
            }
            getPermissions(island).add(permission);
            SkyBlock.getInstance().getIslandsConfiguration().getConfig().getStringList("islands." + island.getOwnerUniqueId() + "permissions").add(permissionUtil.toString(permission));
            SkyBlock.getInstance().getIslandsConfiguration().saveConfig();
        }
    }

    public void removePermission(Island island, IslandPermission... permissions) {
        for (IslandPermission permission : permissions) {
            getPermissions(island).remove(permission);
        }
    }

    public boolean hasPermission(Island island, IslandPermission permission) {
        return getPermissions(island).contains(permission);
    }

}
