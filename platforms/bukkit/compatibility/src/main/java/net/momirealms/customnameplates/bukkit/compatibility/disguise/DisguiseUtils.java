package net.momirealms.customnameplates.bukkit.compatibility.disguise;

import org.bukkit.entity.Player;

/** Placeholder for optional LibsDisguises compatibility (build without the paid/optional dependency). */
public class DisguiseUtils {
    public enum DisguiseType { UNKNOWN }
    public static boolean isDisguised(Player player) { return false; }
    public static DisguiseType getDisguisedType(Player player) { return DisguiseType.UNKNOWN; }
}
