package dev.tim.apigebruiken.commands;

import dev.triumphteam.gui.builder.item.ItemBuilder;
import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.PaginatedGui;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GUICommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;

        PaginatedGui gui = Gui.paginated()
                .title(Component.text(ChatColor.GREEN + "GUI met paginas"))
                .rows(6)
                .pageSize(45)
                .create();

        gui.setItem(6, 3, ItemBuilder.from(Material.ARROW).setName("Vorige").asGuiItem(event -> gui.previous()));
        gui.setItem(6, 7, ItemBuilder.from(Material.ARROW).setName("Volgende").asGuiItem(event -> gui.next()));

        gui.open(player);

        return true;
    }
}
