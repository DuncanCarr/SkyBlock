package horizon.skyblock.utilities.island;

import horizon.skyblock.SkyBlock;

import java.util.*;

public class Island {

    private final PermissionUtil permissionUtil = new PermissionUtil();

    private final UUID owner;

    public Island(UUID owner) {
        this.owner = owner;
    }

    public UUID getOwnerUniqueId() {
        return owner;
    }

    public void updatePermissions(IslandRole role) {
        for (String uuid : SkyBlock.getInstance().getIslandsConfiguration().getConfig().getConfigurationSection("islands").getKeys(false)) {
            List<String> rolePermissions = null;

            if (role == IslandRole.VISITOR) {
                rolePermissions = SkyBlock.getInstance().getIslandsConfiguration().getConfig().getStringList("islands." + uuid + ".permissions.visitor");
            } else
            if (role == IslandRole.MEMBER) {
                rolePermissions = SkyBlock.getInstance().getIslandsConfiguration().getConfig().getStringList("islands." + uuid + ".permissions.member");
            } else
            if (role == IslandRole.MODERATOR) {
                rolePermissions = SkyBlock.getInstance().getIslandsConfiguration().getConfig().getStringList("islands." + uuid + ".permissions.moderator");
            } else
            if (role == IslandRole.OPERATOR) {
                rolePermissions = SkyBlock.getInstance().getIslandsConfiguration().getConfig().getStringList("islands." + uuid + ".permissions.operator");
            }

            if (rolePermissions == null) {
                role.setPermissions(this, IslandPermission.NONE);
            } else {
                for (String permission : rolePermissions) {
                    role.setPermissions(this, permissionUtil.getFromString(permission));
                }
            }
        }
    }

    public void setDefaultPermissions(IslandRole role) {
        if (role == IslandRole.VISITOR) {
            role.setPermissions(this, IslandPermission.ITEM_DROP);
        }

        // TODO Add default permissions for other roles.
    }

    public ArrayList<IslandPermission> getPermissions(IslandRole role) {

        // Make sure permissions are up-to-date
        this.updatePermissions(role);

        return role.getPermissions(this);
    }

}
