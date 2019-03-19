package club.shprqness.db;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class DeadBush extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this,this);
    }



    @EventHandler
    public void onBreakBush(BlockBreakEvent e){

        byte plank = 0;

        //items to drop
        ItemStack wood = new ItemStack(Material.WOOD, 3, plank);
        ItemStack stick = new ItemStack(Material.STICK, 2);
        ItemStack bread = new ItemStack(Material.BREAD, 2);





        Player p = e.getPlayer();
        if(e.getBlock().getType() == Material.DEAD_BUSH){
            if(p.getGameMode() == GameMode.SURVIVAL){
                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), wood);
                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), bread);
                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), stick);
            }
        }

    }



}
