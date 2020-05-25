package horizon.skyblock.utilities.island;

public class PermissionUtil {

    public IslandPermission getFromString(String permission) {
        if (permission.equals("ALL")) {
            return IslandPermission.ALL;
        }
        if (permission.equals("DESTROY_BLOCKS")) {
            return IslandPermission.DESTROY_BLOCKS;
        }
        if (permission.equals("PLACE_BLOCKS")) {
            return IslandPermission.PLACE_BLOCKS;
        }
        if (permission.equals("ANVIL_USE")) {
            return IslandPermission.ANVIL_USE;
        }
        if (permission.equals("ARMOR_STAND_USE")) {
            return IslandPermission.ARMOR_STAND_USE;
        }
        if (permission.equals("BEACON_USE")) {
            return IslandPermission.BEACON_USE;
        }
        if (permission.equals("BED_USE")) {
            return IslandPermission.BED_USE;
        }
        if (permission.equals("ANIMAL_BREEDING")) {
            return IslandPermission.ANIMAL_BREEDING;
        }
        if (permission.equals("BREWING_STAND_USE")) {
            return IslandPermission.BREWING_STAND_USE;
        }
        if (permission.equals("BUCKET_USE")) {
            return IslandPermission.BUCKET_USE;
        }
        if (permission.equals("WATER_COLLECTION")) {
            return IslandPermission.WATER_COLLECTION;
        }
        if (permission.equals("ACCESS_STORAGE")) {
            return IslandPermission.ACCESS_STORAGE;
        }
        if (permission.equals("WORKBENCH_USE")) {
            return IslandPermission.WORKBENCH_USE;
        }
        if (permission.equals("CROP_TRAMPLING")) {
            return IslandPermission.CROP_TRAMPLING;
        }
        if (permission.equals("DOOR_USE")) {
            return IslandPermission.DOOR_USE;
        }
        if (permission.equals("GATE_USE")) {
            return IslandPermission.GATE_USE;
        }
        if (permission.equals("PROJECTILE_LAUNCH")) {
            return IslandPermission.PROJECTILE_LAUNCH;
        }
        if (permission.equals("ENCHANTMENT_TABLE_USE")) {
            return IslandPermission.ENCHANTMENT_TABLE_USE;
        }
        if (permission.equals("FIRE_EXTINGUISH")) {
            return IslandPermission.FIRE_EXTINGUISH;
        }
        if (permission.equals("FURNACE_USE")) {
            return IslandPermission.FURNACE_USE;
        }
        if (permission.equals("ACCESS_HORSE_INVENTORY")) {
            return IslandPermission.ACCESS_HORSE_INVENTORY;
        }
        if (permission.equals("MOB_RIDING")) {
            return IslandPermission.MOB_RIDING;
        }
        if (permission.equals("MONSTER_HURTING")) {
            return IslandPermission.MONSTER_HURTING;
        }
        if (permission.equals("MOB_HURTING")) {
            return IslandPermission.MOB_HURTING;
        }
        if (permission.equals("MOB_TAMING")) {
            return IslandPermission.MOB_TAMING;
        }
        if (permission.equals("LEASH_USE")) {
            return IslandPermission.LEASH_USE;
        }
        if (permission.equals("LEVER_BUTTON_USE")) {
            return IslandPermission.LEVER_BUTTON_USE;
        }
        if (permission.equals("MILKING")) {
            return IslandPermission.MILKING;
        }
        if (permission.equals("JUKEBOX_USE")) {
            return IslandPermission.JUKEBOX_USE;
        }
        if (permission.equals("PRESSURE_PLATE_USE")) {
            return IslandPermission.PRESSURE_PLATE_USE;
        }
        if (permission.equals("REDSTONE_USE")) {
            return IslandPermission.REDSTONE_USE;
        }
        if (permission.equals("MOB_SHEARING")) {
            return IslandPermission.MOB_SHEARING;
        }
        if (permission.equals("VILLAGER_TRADING")) {
            return IslandPermission.VILLAGER_TRADING;
        }
        if (permission.equals("ITEM_DROP")) {
            return IslandPermission.ITEM_DROP;
        }
        if (permission.equals("ITEM_PICKUP")) {
            return IslandPermission.ITEM_PICKUP;
        }
        if (permission.equals("FISHING")) {
            return IslandPermission.FISHING;
        }
        if (permission.equals("DROPPER_DISPENSER_USE")) {
            return IslandPermission.DROPPER_DISPENSER_USE;
        }
        if (permission.equals("SPAWN_EGGS")) {
            return IslandPermission.SPAWN_EGGS;
        }
        if (permission.equals("HANGING_DESTROY")) {
            return IslandPermission.HANGING_DESTROY;
        }
        if (permission.equals("CAKE_CONSUMPTION")) {
            return IslandPermission.CAKE_CONSUMPTION;
        }
        if (permission.equals("DRAGON_EGG_USE")) {
            return IslandPermission.DRAGON_EGG_USE;
        }
        if (permission.equals("MINECART_BOAT_USE")) {
            return IslandPermission.MINECART_BOAT_USE;
        }
        if (permission.equals("PORTAL_USE")) {
            return IslandPermission.PORTAL_USE;
        }
        if (permission.equals("HOPPER_USE")) {
            return IslandPermission.HOPPER_USE;
        }
        if (permission.equals("ENTITY_PLACEMENT")) {
            return IslandPermission.ENTITY_PLACEMENT;
        }
        if (permission.equals("EXPERIENCE_ORB_PICKUP")) {
            return IslandPermission.EXPERIENCE_ORB_PICKUP;
        }
        return IslandPermission.NONE;
    }

    public String toString(IslandPermission permission) {
        if (permission == IslandPermission.ALL) {
            return "ALL";
        }
        if (permission == IslandPermission.DESTROY_BLOCKS) {
            return "DESTROY_BLOCKS";
        }
        if (permission == IslandPermission.PLACE_BLOCKS) {
            return "PLACE_BLOCKS";
        }
        if (permission == IslandPermission.ANVIL_USE) {
            return "ANVIL_USE";
        }
        if (permission == IslandPermission.ARMOR_STAND_USE) {
            return "ARMOR_STAND_USE";
        }
        if (permission == IslandPermission.BEACON_USE) {
            return "BEACON_USE";
        }
        if (permission == IslandPermission.BED_USE) {
            return "BED_USE";
        }
        if (permission == IslandPermission.ANIMAL_BREEDING) {
            return "ANIMAL_BREEDING";
        }
        if (permission == IslandPermission.BREWING_STAND_USE) {
            return "BREWING_STAND_USE";
        }
        if (permission == IslandPermission.BUCKET_USE) {
            return "BUCKET_USE";
        }
        if (permission == IslandPermission.WATER_COLLECTION) {
            return "WATER_COLLECTION";
        }
        if (permission == IslandPermission.ACCESS_STORAGE) {
            return "ACCESS_STORAGE";
        }
        if (permission == IslandPermission.WORKBENCH_USE) {
            return "WORKBENCH_USE";
        }
        if (permission == IslandPermission.CROP_TRAMPLING) {
            return "CROP_TRAMPLING";
        }
        if (permission == IslandPermission.DOOR_USE) {
            return "DOOR_USE";
        }
        if (permission == IslandPermission.GATE_USE) {
            return "GATE_USE";
        }
        if (permission == IslandPermission.PROJECTILE_LAUNCH) {
            return "PROJECTILE_LAUNCH";
        }
        if (permission == IslandPermission.ENCHANTMENT_TABLE_USE) {
            return "ENCHANTMENT_TABLE_USE";
        }
        if (permission == IslandPermission.FIRE_EXTINGUISH) {
            return "FIRE_EXTINGUISH";
        }
        if (permission == IslandPermission.FURNACE_USE) {
            return "FURNACE_USE";
        }
        if (permission == IslandPermission.ACCESS_HORSE_INVENTORY) {
            return "ACCESS_HORSE_INVENTORY";
        }
        if (permission == IslandPermission.MOB_RIDING) {
            return "MOB_RIDING";
        }
        if (permission == IslandPermission.MONSTER_HURTING) {
            return "MONSTER_HURTING";
        }
        if (permission == IslandPermission.MOB_HURTING) {
            return "MOB_HURTING";
        }
        if (permission == IslandPermission.MOB_TAMING) {
            return "MOB_TAMING";
        }
        if (permission == IslandPermission.LEASH_USE) {
            return "LEASH_USE";
        }
        if (permission == IslandPermission.LEVER_BUTTON_USE) {
            return "LEVER_BUTTON_USE";
        }
        if (permission == IslandPermission.MILKING) {
            return "MILKING";
        }
        if (permission == IslandPermission.JUKEBOX_USE) {
            return "JUKEBOX_USE";
        }
        if (permission == IslandPermission.PRESSURE_PLATE_USE) {
            return "PRESSURE_PLATE_USE";
        }
        if (permission == IslandPermission.REDSTONE_USE) {
            return "REDSTONE_USE";
        }
        if (permission == IslandPermission.MOB_SHEARING) {
            return "MOB_SHEARING";
        }
        if (permission == IslandPermission.VILLAGER_TRADING) {
            return "VILLAGER_TRADING";
        }
        if (permission == IslandPermission.ITEM_DROP) {
            return "ITEM_DROP";
        }
        if (permission == IslandPermission.ITEM_PICKUP) {
            return "ITEM_PICKUP";
        }
        if (permission == IslandPermission.FISHING) {
            return "FISHING";
        }
        if (permission == IslandPermission.DROPPER_DISPENSER_USE) {
            return "DROPPER_DISPENSER_USE";
        }
        if (permission == IslandPermission.SPAWN_EGGS) {
            return "SPAWN_EGGS";
        }
        if (permission == IslandPermission.HANGING_DESTROY) {
            return "HANGING_DESTROY";
        }
        if (permission == IslandPermission.CAKE_CONSUMPTION) {
            return "CAKE_CONSUMPTION";
        }
        if (permission == IslandPermission.DRAGON_EGG_USE) {
            return "DRAGON_EGG_USE";
        }
        if (permission == IslandPermission.MINECART_BOAT_USE) {
            return "MINECART_BOAT_USE";
        }
        if (permission == IslandPermission.PORTAL_USE) {
            return "PORTAL_USE";
        }
        if (permission == IslandPermission.HOPPER_USE) {
            return "HOPPER_USE";
        }
        if (permission == IslandPermission.ENTITY_PLACEMENT) {
            return "ENTITY_PLACEMENT";
        }
        if (permission == IslandPermission.EXPERIENCE_ORB_PICKUP) {
            return "EXPERIENCE_ORB_PICKUP";
        }
        return "NONE";
    }
}
