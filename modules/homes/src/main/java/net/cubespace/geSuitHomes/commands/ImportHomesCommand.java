package net.cubespace.geSuitHomes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import net.cubespace.geSuit.managers.CommandManager;
import net.cubespace.geSuitHomes.managers.HomesManager;

public class ImportHomesCommand extends CommandManager<HomesManager> {

	public ImportHomesCommand(HomesManager manager) {
		super(manager);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		manager.importHomes(sender);
		return true;
	}

}
