package vb.$mingmanhunt;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	public static org.bukkit.configuration.file.YamlConfiguration PERSISTENT_VARIABLES;
	public static org.bukkit.inventory.ItemStack ITEM_388f32faac334151fcd8270288946915 = org.bukkit.configuration.file.YamlConfiguration
			.loadConfiguration(new StringReader(
					"item:\n  ==: org.bukkit.inventory.ItemStack\n  v: 3465\n  type: IRON_BOOTS\n  meta:\n    ==: ItemMeta\n    meta-type: ARMOR\n    enchants:\n      SOUL_SPEED: 3\n"))
			.getItemStack("item");
	public static org.bukkit.inventory.ItemStack ITEM_af5d4057580eb9982513de8bc5ef6b0d = org.bukkit.configuration.file.YamlConfiguration
			.loadConfiguration(new StringReader(
					"item:\n  ==: org.bukkit.inventory.ItemStack\n  v: 3465\n  type: POTION\n  meta:\n    ==: ItemMeta\n    meta-type: POTION\n    potion-type: minecraft:fire_resistance\n"))
			.getItemStack("item");
	public static org.bukkit.inventory.ItemStack ITEM_eff303938aa8501a770b32d2b2aae453 = org.bukkit.configuration.file.YamlConfiguration
			.loadConfiguration(new StringReader(
					"item:\n  ==: org.bukkit.inventory.ItemStack\n  v: 3465\n  type: ENCHANTED_BOOK\n  meta:\n    ==: ItemMeta\n    meta-type: ENCHANTED\n    stored-enchants:\n      SOUL_SPEED: 3\n"))
			.getItemStack("item");
	public static org.bukkit.inventory.ItemStack ITEM_e571647d5603226c242cf0e1a5b65981 = org.bukkit.configuration.file.YamlConfiguration
			.loadConfiguration(new StringReader(
					"item:\n  ==: org.bukkit.inventory.ItemStack\n  v: 3465\n  type: POTION\n  meta:\n    ==: ItemMeta\n    meta-type: POTION\n    potion-type: minecraft:water\n"))
			.getItemStack("item");

	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(this, this);
		PERSISTENT_VARIABLES = org.bukkit.configuration.file.YamlConfiguration
				.loadConfiguration(new File(getDataFolder(), "data.yml"));
		try {
			if ((((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
					.getScoreboardManager()).getMainScoreboard()).getTeam("Runner")) == null)) {
				((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).registerNewTeam("Runner");
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Runner"))
								.setColor(((org.bukkit.ChatColor) org.bukkit.ChatColor.GREEN));
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Runner"))
								.setPrefix(ChatColor.translateAlternateColorCodes('&',
										"\u0280\u1D1C\u0274\u0274\u1D07\u0280&7\u2219 "));
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Runner"))
								.setCanSeeFriendlyInvisibles(true);
			}
			if ((((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
					.getScoreboardManager()).getMainScoreboard()).getTeam("Hunter")) == null)) {
				((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).registerNewTeam("Hunter");
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Hunter"))
								.setColor(((org.bukkit.ChatColor) org.bukkit.ChatColor.RED));
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Hunter"))
								.setPrefix(ChatColor.translateAlternateColorCodes('&',
										"\u029C\u1D1C\u0274\u1D1B\u1D07\u0280&7\u2219 "));
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Hunter"))
								.setCanSeeFriendlyInvisibles(true);
			}
			if ((((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
					.getScoreboardManager()).getMainScoreboard()).getTeam("Spectator")) == null)) {
				((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).registerNewTeam("Spectator");
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Spectator"))
								.setColor(((org.bukkit.ChatColor) org.bukkit.ChatColor.GRAY));
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Spectator"))
								.setPrefix(ChatColor.translateAlternateColorCodes('&',
										"\uA731\u1D18\u1D07\u1D04\u1D1B\u1D00\u1D1B\u1D0F\u0280&7\u2219 "));
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Spectator"))
								.setCanSeeFriendlyInvisibles(true);
			}
			if ((((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")) == null)) {
				PluginMain.procedure("createWorlds", new ArrayList());
			}
			if ((PluginMain.PERSISTENT_VARIABLES.get("gameStarted") == null)) {
				PluginMain.procedure("initializeVar", new ArrayList());
				PluginMain.procedure("allHuntersTracking", new ArrayList());
			} else {
				PluginMain.procedure("allHuntersTracking", new ArrayList());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getServer().getPluginManager().registerEvents(PlayerDataManager.getInstance(), this);
		getServer().getPluginManager().registerEvents(GUIManager.getInstance(), this);
		GUIManager.getInstance().register("settings", guiPlayer -> {
			try {
				org.bukkit.inventory.Inventory guiInventory = Bukkit.createInventory(new GUIIdentifier("settings"),
						((int) (36d)), ChatColor.translateAlternateColorCodes('&', "&bGame settings"));
				if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingTracker"))) {
					guiInventory.setItem(((int) (11d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.COMPASS),
									ChatColor.translateAlternateColorCodes('&', "&bTracker"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7Distance &f\u2714 &aEnabled"),
											" ",
											ChatColor.translateAlternateColorCodes('&', "&fClick to &cDisable ")))));
				} else {
					guiInventory.setItem(((int) (11d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.COMPASS),
									ChatColor.translateAlternateColorCodes('&', "&bTracker"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7Distance &f\u2716 &cDisabled"),
											" ",
											ChatColor.translateAlternateColorCodes('&', "&fClick to &aEnable ")))));
				}
				if (PluginMain.checkEquals(PluginMain.PERSISTENT_VARIABLES.get("settingBed"), "reduced")) {
					guiInventory.setItem(((int) (12d)), PluginMain.getNamedItemWithLore(
							((org.bukkit.Material) org.bukkit.Material.WHITE_BED),
							ChatColor.translateAlternateColorCodes('&', "&bBed bomb"),
							new ArrayList(Arrays.asList(
									ChatColor.translateAlternateColorCodes('&', "&f\u2666 &7Damage &f\u2B19 &aReduced"),
									" ", ChatColor.translateAlternateColorCodes('&', "&fClick to &dSwitch ")))));
				} else if (PluginMain.checkEquals(PluginMain.PERSISTENT_VARIABLES.get("settingBed"), "vanilla")) {
					guiInventory.setItem(((int) (12d)), PluginMain.getNamedItemWithLore(
							((org.bukkit.Material) org.bukkit.Material.WHITE_BED),
							ChatColor.translateAlternateColorCodes('&', "&bBed bomb"),
							new ArrayList(Arrays.asList(
									ChatColor.translateAlternateColorCodes('&', "&f\u2666 &7Damage &f\u25C6 &cVanilla"),
									" ", ChatColor.translateAlternateColorCodes('&', "&fClick to &dSwitch ")))));
				} else {
					guiInventory.setItem(((int) (12d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.WHITE_BED),
									ChatColor.translateAlternateColorCodes('&', "&bBed bomb"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7Damage &f\u2716 &3Disabled"),
											" ",
											ChatColor.translateAlternateColorCodes('&', "&fClick to &dSwitch ")))));
				}
				if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingSpawn"))) {
					guiInventory.setItem(((int) (13d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.END_ROD),
									ChatColor.translateAlternateColorCodes('&', "&bHunter's spawn &f[&c&lBETA&f]"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7Near spawn &f\u2714 &aEnabled"),
											" ",
											ChatColor.translateAlternateColorCodes('&', "&fClick to &cDisable ")))));
				} else {
					guiInventory.setItem(((int) (13d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.END_ROD),
									ChatColor.translateAlternateColorCodes('&', "&bHunter's spawn &f[&c&lBETA&f]"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7Near spawn &f\u2716 &cDisabled"),
											" ", ChatColor.translateAlternateColorCodes('&', "&fClick to &aEnable")))));
				}
				if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingFriendly"))) {
					guiInventory.setItem(((int) (14d)), PluginMain.getNamedItemWithLore(
							((org.bukkit.Material) org.bukkit.Material.BEACON),
							ChatColor.translateAlternateColorCodes('&', "&bFriendly fire"),
							new ArrayList(Arrays.asList(
									ChatColor.translateAlternateColorCodes('&', "&f\u2666 &7PvP &f\u2714 &aEnabled"),
									" ", ChatColor.translateAlternateColorCodes('&', "&fClick to &cDisable ")))));
				} else {
					guiInventory.setItem(((int) (14d)), PluginMain.getNamedItemWithLore(
							((org.bukkit.Material) org.bukkit.Material.BEACON),
							ChatColor.translateAlternateColorCodes('&', "&bFriendly fire"),
							new ArrayList(Arrays.asList(
									ChatColor.translateAlternateColorCodes('&', "&f\u2666 &7PvP &f\u2716 &cDisabled"),
									" ", ChatColor.translateAlternateColorCodes('&', "&fClick to &aEnable")))));
				}
				if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingChat"))) {
					guiInventory.setItem(((int) (15d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.PAPER),
									ChatColor.translateAlternateColorCodes('&', "&bChat"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7Team chat &f\u2714 &aEnabled"),
											" ",
											ChatColor.translateAlternateColorCodes('&', "&fClick to &cDisable ")))));
				} else {
					guiInventory.setItem(((int) (15d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.PAPER),
									ChatColor.translateAlternateColorCodes('&', "&bChat"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7Team chat &f\u2716 &cDisabled"),
											" ", ChatColor.translateAlternateColorCodes('&', "&fClick to &aEnable")))));
				}
				if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingBlazes"))) {
					guiInventory.setItem(((int) (21d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.BLAZE_ROD),
									ChatColor.translateAlternateColorCodes('&', "&bBlazes"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7OP Drops &f\u2714 &aEnabled"),
											" ",
											ChatColor.translateAlternateColorCodes('&', "&fClick to &cDisable ")))));
				} else {
					guiInventory.setItem(((int) (21d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.BLAZE_ROD),
									ChatColor.translateAlternateColorCodes('&', "&bBlazes"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7OP Drops &f\u2716 &cDisabled"),
											" ", ChatColor.translateAlternateColorCodes('&', "&fClick to &aEnable")))));
				}
				if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingEnderman"))) {
					guiInventory.setItem(((int) (22d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.ENDER_PEARL),
									ChatColor.translateAlternateColorCodes('&', "&bEnderman"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7OP Drops &f\u2714 &aEnabled"),
											" ",
											ChatColor.translateAlternateColorCodes('&', "&fClick to &cDisable ")))));
				} else {
					guiInventory.setItem(((int) (22d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.ENDER_PEARL),
									ChatColor.translateAlternateColorCodes('&', "&bEnderman"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7OP Drops &f\u2716 &cDisabled"),
											" ",
											ChatColor.translateAlternateColorCodes('&', "&fClick to &aEnable ")))));
				}
				if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingPiglins"))) {
					guiInventory.setItem(((int) (23d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.PIGLIN_HEAD),
									ChatColor.translateAlternateColorCodes('&', "&bPiglins"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7OP Trades &f\u2714 &aEnabled"),
											" ",
											ChatColor.translateAlternateColorCodes('&', "&fClick to &cDisable ")))));
				} else {
					guiInventory.setItem(((int) (23d)),
							PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.PIGLIN_HEAD),
									ChatColor.translateAlternateColorCodes('&', "&bPiglins"),
									new ArrayList(Arrays.asList(
											ChatColor.translateAlternateColorCodes('&',
													"&f\u2666 &7OP Trades &f\u2716 &cDisabled"),
											" ",
											ChatColor.translateAlternateColorCodes('&', "&fClick to &aEnable ")))));
				}
				return guiInventory;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}, false);
	}

	@Override
	public void onDisable() {
		try {
			PERSISTENT_VARIABLES.save(new File(getDataFolder(), "data.yml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		PlayerDataManager.getInstance().saveAllData();
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("testofflineplayers")) {
			try {
				for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOfflinePlayers())) {
					org.bukkit.Bukkit.broadcastMessage(String.valueOf(FINAL_loopValue1));
					org.bukkit.Bukkit.broadcastMessage(
							((java.lang.String) ((org.bukkit.command.CommandSender) (Object) FINAL_loopValue1)
									.getName()));
					org.bukkit.Bukkit.broadcastMessage(
							String.valueOf(((org.bukkit.Location) ((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1)
									.getBedSpawnLocation())));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("nearspawn")) {
			try {
				((org.bukkit.block.Block) ((org.bukkit.Location) (Object) PluginMain.function("randomNearSpawn",
						new ArrayList(Arrays.asList(commandSender)))).getBlock())
								.setType(((org.bukkit.Material) org.bukkit.Material.RED_WOOL));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("disableflight")) {
			try {
				for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
					((org.bukkit.entity.Player) (Object) FINAL_loopValue1).setAllowFlight(false);
				}
				for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOfflinePlayers())) {
					((org.bukkit.entity.Player) (Object) FINAL_loopValue1).setAllowFlight(false);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("regen")) {
			Object $99a0ad2ec35203e55397cc42a7242e9c = null;
			Object $95ed4d551ae42168a88b14e4333ad2d6 = null;
			try {
				if (!(((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")) == null)) {
					if (!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameRegenerates"))) {
						PluginMain.PERSISTENT_VARIABLES.set("gameStarted", ((java.lang.Object) (Object) false));
						PluginMain.PERSISTENT_VARIABLES.set("gamePaused", ((java.lang.Object) (Object) false));
						org.bukkit.Bukkit.broadcastMessage(((ChatColor.translateAlternateColorCodes('&', "&f")
								+ ((java.lang.String) commandSender.getName()))
								+ ChatColor.translateAlternateColorCodes('&', " &7\u2192 &b&lRegen the worlds")));
						PluginMain.PERSISTENT_VARIABLES.set("gameRegenerates", ((java.lang.Object) (Object) true));
						for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOfflinePlayers())) {
							if (!(((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
									.getScoreboardManager()).getMainScoreboard()).getPlayerTeam(
											((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1))) == null)) {
								((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
										.getScoreboardManager()).getMainScoreboard())
												.getPlayerTeam(((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1)))
														.removePlayer(
																((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1));
							}
						}
						((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
								.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
										.deleteWorld("manhunt", true, true);
						org.bukkit.Bukkit.broadcastMessage(
								ChatColor.translateAlternateColorCodes('&', "Regeneration &7\u2192 &b&l20%"));
						((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
								.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
										.deleteWorld("manhunt_nether", true, true);
						org.bukkit.Bukkit.broadcastMessage(
								ChatColor.translateAlternateColorCodes('&', "Regeneration &7\u2192 &b&l30%"));
						((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
								.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
										.deleteWorld("manhunt_the_end", true, true);
						org.bukkit.Bukkit.broadcastMessage(
								ChatColor.translateAlternateColorCodes('&', "Regeneration &7\u2192 &b&l40%"));
						PluginMain.procedure("createWorlds", new ArrayList());
						org.bukkit.Bukkit.broadcastMessage(
								ChatColor.translateAlternateColorCodes('&', "Regeneration &7\u2192 &b&l90%"));
						PluginMain.PERSISTENT_VARIABLES.set("gameRegenerates", ((java.lang.Object) (Object) false));
						for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
							((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
									.getScoreboardManager()).getMainScoreboard()).getTeam("Spectator"))
											.addPlayer(((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1));
							((org.bukkit.entity.HumanEntity) (Object) FINAL_loopValue1)
									.setGameMode(((org.bukkit.GameMode) org.bukkit.GameMode.SPECTATOR));
							((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) FINAL_loopValue1)
									.getInventory()).clear();
						}
						org.bukkit.Bukkit.broadcastMessage(
								ChatColor.translateAlternateColorCodes('&', "Regeneration &7\u2192 &b&lDone!"));
						if (PluginMain.checkEquals(((java.lang.Object) (Object) (1d)),
								((java.lang.Object) (Object) (2d)))) {
							$95ed4d551ae42168a88b14e4333ad2d6 = ((java.lang.Object) (Object) Math
									.round(java.util.concurrent.ThreadLocalRandom.current()
											.nextDouble((-9000000000000000d), (9000000000000000d))));
							((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
									.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
											.regenWorld("manhunt", true, false,
													String.valueOf($95ed4d551ae42168a88b14e4333ad2d6), false);
							((com.onarandombox.MultiverseCore.api.MultiverseWorld) ((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
									.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
											.getMVWorld("manhunt")).setGameMode("SPECTATOR");
							((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
									((org.bukkit.GameRule) org.bukkit.GameRule.DO_DAYLIGHT_CYCLE),
									((java.lang.Object) (Object) false));
							org.bukkit.Bukkit.broadcastMessage(
									ChatColor.translateAlternateColorCodes('&', "Regeneration &7\u2192 &b&l30%"));
							((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
									.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
											.regenWorld("manhunt_nether", true, false,
													String.valueOf($95ed4d551ae42168a88b14e4333ad2d6), false);
							org.bukkit.Bukkit.broadcastMessage(
									ChatColor.translateAlternateColorCodes('&', "Regeneration &7\u2192 &b&l60%"));
							((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
									.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
											.regenWorld("manhunt_the_end", true, false,
													String.valueOf($95ed4d551ae42168a88b14e4333ad2d6), false);
							org.bukkit.Bukkit.broadcastMessage(
									ChatColor.translateAlternateColorCodes('&', "Regeneration &7\u2192 &b&l90%"));
							$99a0ad2ec35203e55397cc42a7242e9c = PluginMain.function("spawnAlgorithm", new ArrayList(
									Arrays.asList(((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")))));
							org.bukkit.Bukkit.broadcastMessage(String.valueOf($99a0ad2ec35203e55397cc42a7242e9c));
							((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setSpawnLocation(
									((org.bukkit.Location) (Object) $99a0ad2ec35203e55397cc42a7242e9c));
						}
					} else {
						commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"&cGame currently regenerates, impossible to perform game commands."));
					}
				} else {
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&cManhunt worlds does not exist, impossible to regenerate them. Try to reload the server."));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("unpause")) {
			try {
				if (!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameRegenerates"))) {
					PluginMain.PERSISTENT_VARIABLES.set("gamePaused", ((java.lang.Object) (Object) false));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.DO_DAYLIGHT_CYCLE),
							((java.lang.Object) (Object) true));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.DO_MOB_SPAWNING),
							((java.lang.Object) (Object) true));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.FALL_DAMAGE),
							((java.lang.Object) (Object) true));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.RANDOM_TICK_SPEED),
							((java.lang.Object) (Object) (3d)));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.NATURAL_REGENERATION),
							((java.lang.Object) (Object) true));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.DISABLE_RAIDS),
							((java.lang.Object) (Object) false));
					for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
						((org.bukkit.entity.Player) (Object) FINAL_loopValue1).setAllowFlight(false);
					}
					org.bukkit.Bukkit.broadcastMessage(((ChatColor.translateAlternateColorCodes('&', "&f")
							+ ((java.lang.String) commandSender.getName()))
							+ ChatColor.translateAlternateColorCodes('&', " &7\u2192 &b&lResumed the game")));
				} else {
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&cGame currently regenerates, impossible to perform game commands."));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("pause")) {
			try {
				if (!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameRegenerates"))) {
					PluginMain.PERSISTENT_VARIABLES.set("gamePaused", ((java.lang.Object) (Object) true));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.DO_DAYLIGHT_CYCLE),
							((java.lang.Object) (Object) false));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.DO_MOB_SPAWNING),
							((java.lang.Object) (Object) false));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.FALL_DAMAGE),
							((java.lang.Object) (Object) false));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.RANDOM_TICK_SPEED),
							((java.lang.Object) (Object) (0d)));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.NATURAL_REGENERATION),
							((java.lang.Object) (Object) false));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.DISABLE_RAIDS),
							((java.lang.Object) (Object) true));
					for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
						((org.bukkit.entity.Player) (Object) FINAL_loopValue1).setAllowFlight(true);
					}
					new org.bukkit.scheduler.BukkitRunnable() {
						public void run() {
							try {
								if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
									for (Object FINAL_loopValue1 : PluginMain
											.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
										((org.bukkit.entity.LivingEntity) (Object) FINAL_loopValue1)
												.addPotionEffect(new org.bukkit.potion.PotionEffect(
														((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SLOW_FALLING),
														((int) (1d)), ((int) (68d)), false, false, false));
										((org.bukkit.entity.LivingEntity) (Object) FINAL_loopValue1)
												.addPotionEffect(new org.bukkit.potion.PotionEffect(
														((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.WATER_BREATHING),
														((int) (1d)), ((int) (68d)), false, false, false));
									}
								} else {
									cancel();
								}
							} catch (Exception ex) {
								ex.printStackTrace();
							}
						}
					}.runTaskLater(PluginMain.getInstance(), ((long) (1d)));
					org.bukkit.Bukkit.broadcastMessage(((ChatColor.translateAlternateColorCodes('&', "&f")
							+ ((java.lang.String) commandSender.getName()))
							+ ChatColor.translateAlternateColorCodes('&', " &7\u2192 &b&lPaused the game")));
				} else {
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&cGame currently regenerates, impossible to perform game commands."));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("spectator")) {
			try {
				if (!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameRegenerates"))) {
					((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
							.getScoreboardManager()).getMainScoreboard()).getTeam("Spectator"))
									.addPlayer(((org.bukkit.OfflinePlayer) (Object) commandSender));
					org.bukkit.Bukkit.broadcastMessage(((ChatColor.translateAlternateColorCodes('&', "&f")
							+ ((java.lang.String) commandSender.getName()))
							+ ChatColor.translateAlternateColorCodes('&', " &7\u2192 &lSpectator")));
					if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted"))) {
						((org.bukkit.entity.HumanEntity) (Object) commandSender)
								.setGameMode(((org.bukkit.GameMode) org.bukkit.GameMode.SPECTATOR));
					}
				} else {
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&cGame currently regenerates, impossible to perform game commands."));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("runner")) {
			try {
				if (!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameRegenerates"))) {
					if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted"))) {
						commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"&cYou cannot be a runner while the game is being started."));
					} else {
						((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
								.getScoreboardManager()).getMainScoreboard()).getTeam("Runner"))
										.addPlayer(((org.bukkit.OfflinePlayer) (Object) commandSender));
						org.bukkit.Bukkit.broadcastMessage(((ChatColor.translateAlternateColorCodes('&', "&f")
								+ ((java.lang.String) commandSender.getName()))
								+ ChatColor.translateAlternateColorCodes('&', " &7\u2192 &a&lRunner")));
					}
				} else {
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&cGame currently regenerates, impossible to perform game commands."));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("hunter")) {
			try {
				if (!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameRegenerates"))) {
					if (!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted"))) {
						((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
								.getScoreboardManager()).getMainScoreboard()).getTeam("Hunter"))
										.addPlayer(((org.bukkit.OfflinePlayer) (Object) commandSender));
						org.bukkit.Bukkit.broadcastMessage(((ChatColor.translateAlternateColorCodes('&', "&f")
								+ ((java.lang.String) commandSender.getName()))
								+ ChatColor.translateAlternateColorCodes('&', " &7\u2192 &c&lHunter")));
					} else if ((PluginMain
							.checkEquals(((org.bukkit.GameMode) ((org.bukkit.entity.HumanEntity) (Object) commandSender)
									.getGameMode()), ((org.bukkit.GameMode) org.bukkit.GameMode.SPECTATOR))
							&& ((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted")))) {
						((org.bukkit.entity.HumanEntity) (Object) commandSender)
								.setGameMode(((org.bukkit.GameMode) org.bukkit.GameMode.SURVIVAL));
						((org.bukkit.entity.Entity) (Object) commandSender).teleport(
								((org.bukkit.Location) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
										.getSpawnLocation()));
						((org.bukkit.entity.Damageable) (Object) commandSender).setHealth(
								((double) ((org.bukkit.entity.Damageable) (Object) commandSender).getMaxHealth()));
						((org.bukkit.entity.HumanEntity) (Object) commandSender).setFoodLevel(((int) (20d)));
						((org.bukkit.entity.HumanEntity) (Object) commandSender).setSaturation(((float) (5d)));
						((org.bukkit.entity.Player) (Object) commandSender).setExp(((float) (0d)));
						((org.bukkit.entity.Player) (Object) commandSender).setLevel(((int) (0d)));
						((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
								.getInventory()).clear();
						((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
								.getScoreboardManager()).getMainScoreboard()).getTeam("Hunter"))
										.addPlayer(((org.bukkit.OfflinePlayer) (Object) commandSender));
						org.bukkit.Bukkit.broadcastMessage(((ChatColor.translateAlternateColorCodes('&', "&f")
								+ ((java.lang.String) commandSender.getName()))
								+ ChatColor.translateAlternateColorCodes('&', " &7\u2192 &c&lHunter")));
					} else {
						commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"&cYou cannot be a hunter while the game is being started when you are already playing."));
					}
				} else {
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&cGame currently regenerates, impossible to perform game commands."));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("start")) {
			Object $93b2f076cea65ac3db837a144b08c84d = null;
			Object $1976445ef673b4969c56c6e0f4b3ea36 = null;
			Object $0b157a95d932f867450c205138c0d6b2 = null;
			try {
				if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameRegenerates"))) {
					if (true)
						return true;
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&cGame currently regenerates, impossible to perform game commands."));
				}
				if ((PluginMain.checkEquals(((java.lang.Object) (Object) ((int) PluginMain.createList(
						((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
								.getScoreboardManager()).getMainScoreboard()).getTeam("Runner")).getPlayers())
						.size())), ((java.lang.Object) (Object) (0d)))
						&& PluginMain.checkEquals(((java.lang.Object) (Object) ((int) PluginMain.createList(
								((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
										.getScoreboardManager()).getMainScoreboard()).getTeam("Hunter")).getPlayers())
								.size())), ((java.lang.Object) (Object) (0d))))) {
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&cThe game needs to have at least one player in one team to start the game"));
				} else if ((!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted")))) {
					PluginMain.PERSISTENT_VARIABLES.set("gameStarted", ((java.lang.Object) (Object) true));
					((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
							((org.bukkit.GameRule) org.bukkit.GameRule.DO_DAYLIGHT_CYCLE),
							((java.lang.Object) (Object) true));
					((com.onarandombox.MultiverseCore.api.MultiverseWorld) ((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
							.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
									.getMVWorld("manhunt")).setGameMode("SURVIVAL");
					$0b157a95d932f867450c205138c0d6b2 = new ArrayList();
					((java.util.List) (Object) $0b157a95d932f867450c205138c0d6b2)
							.addAll(((java.util.Collection) (Object) PluginMain.createList(
									((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
											.getScoreboardManager()).getMainScoreboard()).getTeam("Runner"))
													.getPlayers())));
					((java.util.List) (Object) $0b157a95d932f867450c205138c0d6b2)
							.addAll(((java.util.Collection) (Object) PluginMain.createList(
									((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
											.getScoreboardManager()).getMainScoreboard()).getTeam("Hunter"))
													.getPlayers())));
					for (Object FINAL_loopValue1 : ((java.util.List) (Object) $0b157a95d932f867450c205138c0d6b2)) {
						if (((boolean) ((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1).isOnline())) {
							((org.bukkit.entity.HumanEntity) (Object) FINAL_loopValue1)
									.setGameMode(((org.bukkit.GameMode) org.bukkit.GameMode.SURVIVAL));
							((org.bukkit.entity.Entity) (Object) FINAL_loopValue1).teleport(
									((org.bukkit.Location) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
											.getSpawnLocation()));
							((org.bukkit.entity.Damageable) (Object) FINAL_loopValue1)
									.setHealth(((double) ((org.bukkit.entity.Damageable) (Object) FINAL_loopValue1)
											.getMaxHealth()));
							((org.bukkit.entity.HumanEntity) (Object) FINAL_loopValue1).setFoodLevel(((int) (20d)));
							((org.bukkit.entity.HumanEntity) (Object) FINAL_loopValue1).setSaturation(((float) (5d)));
							((org.bukkit.entity.Player) (Object) FINAL_loopValue1).setExp(((float) (0d)));
							((org.bukkit.entity.Player) (Object) FINAL_loopValue1).setLevel(((int) (0d)));
							((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) FINAL_loopValue1)
									.getInventory()).clear();
							$93b2f076cea65ac3db837a144b08c84d = FINAL_loopValue1;
							$1976445ef673b4969c56c6e0f4b3ea36 = ((java.util.Iterator) org.bukkit.Bukkit
									.advancementIterator());
							if (PluginMain.checkEquals(((java.lang.Object) (Object) (1d)),
									((java.lang.Object) (Object) (2d)))) {
								for (Object FINAL_loopValue2 : ((java.util.List) (Object) ((java.util.Iterator) org.bukkit.Bukkit
										.advancementIterator()))) {
									if (((boolean) ((org.bukkit.advancement.AdvancementProgress) ((org.bukkit.entity.Player) (Object) $93b2f076cea65ac3db837a144b08c84d)
											.getAdvancementProgress(
													((org.bukkit.advancement.Advancement) (Object) FINAL_loopValue2)))
															.isDone())) {
										((org.bukkit.advancement.AdvancementProgress) ((org.bukkit.entity.Player) (Object) $93b2f076cea65ac3db837a144b08c84d)
												.getAdvancementProgress(
														((org.bukkit.advancement.Advancement) (Object) FINAL_loopValue2)))
																.revokeCriteria(String.valueOf(PluginMain.createList(
																		((org.bukkit.advancement.Advancement) (Object) FINAL_loopValue2)
																				.getCriteria())));
									}
								}
							}
						}
					}
					org.bukkit.Bukkit.broadcastMessage(((ChatColor.translateAlternateColorCodes('&', "&f")
							+ ((java.lang.String) commandSender.getName()))
							+ ChatColor.translateAlternateColorCodes('&', " &7\u2192 &b&lStarted the game")));
					PluginMain.procedure("allHuntersTracking", new ArrayList());
				} else {
					commandSender.sendMessage(
							ChatColor.translateAlternateColorCodes('&', "&cThe game has already started."));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("settings")) {
			try {
				GUIManager.getInstance().open("settings", ((org.bukkit.entity.Player) (Object) commandSender));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("multiregen")) {
			Object $95ed4d551ae42168a88b14e4333ad2d6 = null;
			try {
				$95ed4d551ae42168a88b14e4333ad2d6 = ((java.lang.Object) (Object) Math
						.round(java.util.concurrent.ThreadLocalRandom.current().nextDouble((-9000000000000000d),
								(9000000000000000d))));
				((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager()).regenWorld(
								"manhunt", true, false, String.valueOf($95ed4d551ae42168a88b14e4333ad2d6), true);
				((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager()).regenWorld(
								"manhunt_nether", true, false, String.valueOf($95ed4d551ae42168a88b14e4333ad2d6), true);
				((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager()).regenWorld(
								"manhunt_the_end", true, false, String.valueOf($95ed4d551ae42168a88b14e4333ad2d6),
								true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("multidelete")) {
			try {
				((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
								.deleteWorld("manhunt", true, true);
				((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
								.deleteWorld("manhunt_nether", true, true);
				((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
								.deleteWorld("manhunt_the_end", true, true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("multicreate")) {
			Object $c0ce91178b104b16c05ba569de9c9d84 = null;
			try {
				((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
								.addWorld("manhunt", World.Environment.NORMAL, null, WorldType.NORMAL, true, null);
				((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager()).addWorld(
								"manhunt_nether", World.Environment.NETHER, null, WorldType.NORMAL, true, null);
				((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager()).addWorld(
								"manhunt_the_end", World.Environment.THE_END, null, WorldType.NORMAL, true, null);
				$c0ce91178b104b16c05ba569de9c9d84 = PluginMain.function("spawnAlgorithm",
						new ArrayList(Arrays.asList(((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")))));
				for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
					((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
							.teleport(((org.bukkit.Location) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
									.getSpawnLocation()));
				}
				((com.onarandombox.MultiverseCore.api.MultiverseCoreConfig) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVConfig())
								.setFirstSpawnWorld("manhunt");
				((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
								.setFirstSpawnWorld("manhunt");
				((com.onarandombox.MultiverseCore.api.MultiverseWorld) ((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
								.getMVWorld("manhunt_nether")).setRespawnToWorld("manhunt");
				((com.onarandombox.MultiverseCore.api.MultiverseWorld) ((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
						.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
								.getMVWorld("manhunt_the_end")).setRespawnToWorld("manhunt");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
		if (procedure.equalsIgnoreCase("pauseGameAsConsole")) {
			if (!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameRegenerates"))) {
				PluginMain.PERSISTENT_VARIABLES.set("gamePaused", ((java.lang.Object) (Object) true));
				((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
						((org.bukkit.GameRule) org.bukkit.GameRule.DO_DAYLIGHT_CYCLE),
						((java.lang.Object) (Object) false));
				((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
						((org.bukkit.GameRule) org.bukkit.GameRule.DO_MOB_SPAWNING),
						((java.lang.Object) (Object) false));
				((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
						((org.bukkit.GameRule) org.bukkit.GameRule.FALL_DAMAGE), ((java.lang.Object) (Object) false));
				((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
						((org.bukkit.GameRule) org.bukkit.GameRule.RANDOM_TICK_SPEED),
						((java.lang.Object) (Object) (0d)));
				((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
						((org.bukkit.GameRule) org.bukkit.GameRule.NATURAL_REGENERATION),
						((java.lang.Object) (Object) false));
				((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
						((org.bukkit.GameRule) org.bukkit.GameRule.DISABLE_RAIDS), ((java.lang.Object) (Object) true));
				new org.bukkit.scheduler.BukkitRunnable() {
					public void run() {
						try {
							if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
								for (Object FINAL_loopValue1 : PluginMain
										.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
									((org.bukkit.entity.LivingEntity) (Object) FINAL_loopValue1)
											.addPotionEffect(new org.bukkit.potion.PotionEffect(
													((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.SLOW_FALLING),
													((int) (1d)), ((int) (68d)), false, false, false));
									((org.bukkit.entity.LivingEntity) (Object) FINAL_loopValue1)
											.addPotionEffect(new org.bukkit.potion.PotionEffect(
													((org.bukkit.potion.PotionEffectType) org.bukkit.potion.PotionEffectType.WATER_BREATHING),
													((int) (1d)), ((int) (68d)), false, false, false));
									((org.bukkit.entity.Player) (Object) FINAL_loopValue1).setAllowFlight(true);
								}
							} else {
								cancel();
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				}.runTaskLater(PluginMain.getInstance(), ((long) (1d)));
			}
			return;
		}
		if (procedure.equalsIgnoreCase("allHuntersTracking")) {
			Object $755432665e3b1ee5bbc5f349f74a41ce = null;
			Object $281b0f638ebd55f3b287171e39209c70 = null;
			Object $7469d9c5af7052c80271c9b947e30904 = null;
			Object TEMP_wpjthEcrtVvTHugg = $755432665e3b1ee5bbc5f349f74a41ce;
			Object TEMP_ksigVRCNiowUcvSf = $7469d9c5af7052c80271c9b947e30904;
			Object TEMP_FlYvvRVXBmsYtlbH = $281b0f638ebd55f3b287171e39209c70;
			new org.bukkit.scheduler.BukkitRunnable() {
				Object FINAL_ZQzNcbnpVYddNItQ = TEMP_wpjthEcrtVvTHugg;
				Object FINAL_SfdOAaFCiljsHKZM = TEMP_ksigVRCNiowUcvSf;
				Object FINAL_qleVaTGGSRWDZxYI = TEMP_FlYvvRVXBmsYtlbH;

				public void run() {
					try {
						if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted"))) {
							for (Object FINAL_loopValue1 : PluginMain.createList(
									((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
											.getScoreboardManager()).getMainScoreboard()).getTeam("Hunter"))
													.getPlayers())) {
								FINAL_ZQzNcbnpVYddNItQ = FINAL_loopValue1;
								if (((boolean) ((org.bukkit.OfflinePlayer) (Object) FINAL_ZQzNcbnpVYddNItQ)
										.isOnline())) {
									FINAL_SfdOAaFCiljsHKZM = new ArrayList();
									for (Object FINAL_loopValue2 : PluginMain.createList(
											((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
													.getScoreboardManager()).getMainScoreboard()).getTeam("Runner"))
															.getPlayers())) {
										if (((boolean) ((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue2)
												.isOnline())) {
											FINAL_qleVaTGGSRWDZxYI = PluginMain.function("trackPlayer", new ArrayList(
													Arrays.asList(FINAL_ZQzNcbnpVYddNItQ, FINAL_loopValue2)));
											if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES
													.get("settingTracker"))) {
												((java.util.List) (Object) FINAL_SfdOAaFCiljsHKZM).add((((((ChatColor
														.translateAlternateColorCodes('&', "&b")
														+ ((java.lang.String) ((org.bukkit.command.CommandSender) (Object) FINAL_loopValue2)
																.getName()))
														+ ChatColor.translateAlternateColorCodes('&', " &f"))
														+ String.valueOf(
																((java.lang.Object) ((java.util.List) (Object) FINAL_qleVaTGGSRWDZxYI)
																		.get(((int) (0d))))))
														+ " ")
														+ String.valueOf(
																((java.lang.Object) ((java.util.List) (Object) FINAL_qleVaTGGSRWDZxYI)
																		.get(((int) (1d)))))));
											} else {
												((java.util.List) (Object) FINAL_SfdOAaFCiljsHKZM).add((((ChatColor
														.translateAlternateColorCodes('&', "&b")
														+ ((java.lang.String) ((org.bukkit.command.CommandSender) (Object) FINAL_loopValue2)
																.getName()))
														+ ChatColor.translateAlternateColorCodes('&', " &f"))
														+ String.valueOf(
																((java.lang.Object) ((java.util.List) (Object) FINAL_qleVaTGGSRWDZxYI)
																		.get(((int) (0d)))))));
											}
											((org.bukkit.entity.Player) (Object) FINAL_ZQzNcbnpVYddNItQ).spigot()
													.sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR,
															net.md_5.bungee.api.chat.TextComponent
																	.fromLegacyText(String.join(" \u2219 ",
																			((java.util.List) (Object) FINAL_SfdOAaFCiljsHKZM))));
										}
									}
								}
							}
						} else {
							cancel();
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}.runTaskTimer(PluginMain.getInstance(), 0, ((long) (3d)));
			return;
		}
		if (procedure.equalsIgnoreCase("createWorlds")) {
			((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
					.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
							.addWorld("manhunt", World.Environment.NORMAL, null, WorldType.NORMAL, true, null, true);
			((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
					.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager()).addWorld(
							"manhunt_nether", World.Environment.NETHER, null, WorldType.NORMAL, true, null, true);
			((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
					.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager()).addWorld(
							"manhunt_the_end", World.Environment.THE_END, null, WorldType.NORMAL, true, null, true);
			((com.onarandombox.MultiverseCore.api.MultiverseCoreConfig) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
					.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVConfig())
							.setFirstSpawnWorld("manhunt");
			((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
					.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
							.setFirstSpawnWorld("manhunt");
			((com.onarandombox.MultiverseCore.api.MultiverseWorld) ((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
					.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
							.getMVWorld("manhunt_nether")).setRespawnToWorld("manhunt");
			((com.onarandombox.MultiverseCore.api.MultiverseWorld) ((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
					.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
							.getMVWorld("manhunt_the_end")).setRespawnToWorld("manhunt");
			((com.onarandombox.MultiverseCore.api.MultiverseWorld) ((com.onarandombox.MultiverseCore.api.MVWorldManager) ((com.onarandombox.MultiverseCore.api.Core) (Object) ((com.onarandombox.MultiverseCore.MultiverseCore) Bukkit
					.getServer().getPluginManager().getPlugin("Multiverse-Core"))).getMVWorldManager())
							.getMVWorld("manhunt")).setGameMode("SPECTATOR");
			for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
				((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
						.teleport(((org.bukkit.Location) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
								.getSpawnLocation()));
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Spectator"))
								.addPlayer(((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1));
			}
			((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")).setGameRule(
					((org.bukkit.GameRule) org.bukkit.GameRule.DO_DAYLIGHT_CYCLE), ((java.lang.Object) (Object) false));
			org.bukkit.Bukkit.dispatchCommand(
					((org.bukkit.command.CommandSender) (Object) ((org.bukkit.command.ConsoleCommandSender) org.bukkit.Bukkit
							.getConsoleSender())),
					"advancement revoke @a everything");
			return;
		}
		if (procedure.equalsIgnoreCase("")) {
			return;
		}
		if (procedure.equalsIgnoreCase("initializeVar")) {
			PluginMain.PERSISTENT_VARIABLES.set("gameStarted", ((java.lang.Object) (Object) false));
			PluginMain.PERSISTENT_VARIABLES.set("gamePaused", ((java.lang.Object) (Object) false));
			PluginMain.PERSISTENT_VARIABLES.set("gameRegenerates", ((java.lang.Object) (Object) false));
			PluginMain.PERSISTENT_VARIABLES.set("settingTracker", ((java.lang.Object) (Object) false));
			PluginMain.PERSISTENT_VARIABLES.set("settingBed", "reduced");
			PluginMain.PERSISTENT_VARIABLES.set("settingSpawn", ((java.lang.Object) (Object) false));
			PluginMain.PERSISTENT_VARIABLES.set("settingFriendly", ((java.lang.Object) (Object) true));
			PluginMain.PERSISTENT_VARIABLES.set("settingChat", ((java.lang.Object) (Object) true));
			PluginMain.PERSISTENT_VARIABLES.set("settingBlazes", ((java.lang.Object) (Object) false));
			PluginMain.PERSISTENT_VARIABLES.set("settingEnderman", ((java.lang.Object) (Object) false));
			PluginMain.PERSISTENT_VARIABLES.set("settingPiglins", ((java.lang.Object) (Object) false));
			return;
		}
	}

	public static Object function(String function, List functionArgs) throws Exception {
		if (function.equalsIgnoreCase("nearestSpawn")) {
			Object $3a87038c60a21cadc8fd302e91cce86c = null;
			Object $5b66d8a3dbaf3db6a6bde7502c733260 = null;
			Object $ed50521d1680892bb8ff02630afd766a = null;
			Object $f1803b1540e7e0b45fe9bee8fdd4c855 = null;
			Object $cf0ba6185ddfc59ba81ec75dc0cbb4b2 = null;
			Object $f6b2f66c8964a744353a3a5168c85a10 = null;
			Object $f8889b1f7fbcf1f942a789d44a22286c = null;
			Object $abf586b67adfe1d5b21c49cb4662b777 = null;
			Object $31c7eb675dc4cdba2948be210c51abd7 = null;
			Object $078938597d6a984a13bf93f124cbd0c3 = null;
			Object $91996c1cc808ea84c1e0c3d7639bec35 = null;
			$5b66d8a3dbaf3db6a6bde7502c733260 = ((java.lang.Object) (Object) (30d));
			$abf586b67adfe1d5b21c49cb4662b777 = ((java.lang.Object) (Object) ((double) ((org.bukkit.Location) (Object) functionArgs
					.get(((int) (0d)))).getX()));
			org.bukkit.Bukkit.broadcastMessage(("playerX = " + String.valueOf($abf586b67adfe1d5b21c49cb4662b777)));
			$3a87038c60a21cadc8fd302e91cce86c = ((java.lang.Object) (Object) ((double) ((org.bukkit.Location) (Object) functionArgs
					.get(((int) (0d)))).getZ()));
			org.bukkit.Bukkit.broadcastMessage(("playerZ = " + String.valueOf($3a87038c60a21cadc8fd302e91cce86c)));
			$ed50521d1680892bb8ff02630afd766a = ((java.lang.Object) (Object) ((double) ((org.bukkit.Location) (Object) functionArgs
					.get(((int) (1d)))).getX()));
			org.bukkit.Bukkit.broadcastMessage(("deathX = " + String.valueOf($ed50521d1680892bb8ff02630afd766a)));
			$91996c1cc808ea84c1e0c3d7639bec35 = ((java.lang.Object) (Object) ((double) ((org.bukkit.Location) (Object) functionArgs
					.get(((int) (1d)))).getZ()));
			org.bukkit.Bukkit.broadcastMessage(("deathZ = " + String.valueOf($91996c1cc808ea84c1e0c3d7639bec35)));
			$f6b2f66c8964a744353a3a5168c85a10 = ((java.lang.Object) (Object) (((Number) $ed50521d1680892bb8ff02630afd766a)
					.doubleValue() - ((Number) $abf586b67adfe1d5b21c49cb4662b777).doubleValue()));
			org.bukkit.Bukkit.broadcastMessage(("deltaX = " + String.valueOf($f6b2f66c8964a744353a3a5168c85a10)));
			$078938597d6a984a13bf93f124cbd0c3 = ((java.lang.Object) (Object) (((Number) $91996c1cc808ea84c1e0c3d7639bec35)
					.doubleValue() - ((Number) $3a87038c60a21cadc8fd302e91cce86c).doubleValue()));
			org.bukkit.Bukkit.broadcastMessage(("deltaZ = " + String.valueOf($078938597d6a984a13bf93f124cbd0c3)));
			$f8889b1f7fbcf1f942a789d44a22286c = ((java.lang.Object) (Object) Math
					.sqrt(((((Number) $f6b2f66c8964a744353a3a5168c85a10).doubleValue()
							* ((Number) $f6b2f66c8964a744353a3a5168c85a10).doubleValue())
							+ (((Number) $078938597d6a984a13bf93f124cbd0c3).doubleValue()
									* ((Number) $078938597d6a984a13bf93f124cbd0c3).doubleValue()))));
			org.bukkit.Bukkit.broadcastMessage(("distance = " + String.valueOf($f8889b1f7fbcf1f942a789d44a22286c)));
			$31c7eb675dc4cdba2948be210c51abd7 = ((java.lang.Object) (Object) (((((Number) $abf586b67adfe1d5b21c49cb4662b777)
					.doubleValue() + ((Number) $f6b2f66c8964a744353a3a5168c85a10).doubleValue())
					/ ((Number) $f8889b1f7fbcf1f942a789d44a22286c).doubleValue())
					* ((Number) $5b66d8a3dbaf3db6a6bde7502c733260).doubleValue()));
			org.bukkit.Bukkit.broadcastMessage(("spawnX = " + String.valueOf($31c7eb675dc4cdba2948be210c51abd7)));
			$cf0ba6185ddfc59ba81ec75dc0cbb4b2 = ((java.lang.Object) (Object) (((((Number) $3a87038c60a21cadc8fd302e91cce86c)
					.doubleValue() + ((Number) $078938597d6a984a13bf93f124cbd0c3).doubleValue())
					/ ((Number) $f8889b1f7fbcf1f942a789d44a22286c).doubleValue())
					* ((Number) $5b66d8a3dbaf3db6a6bde7502c733260).doubleValue()));
			org.bukkit.Bukkit.broadcastMessage(("spawnZ = " + String.valueOf($cf0ba6185ddfc59ba81ec75dc0cbb4b2)));
			$f1803b1540e7e0b45fe9bee8fdd4c855 = ((java.lang.Object) (Object) ((int) ((org.bukkit.RegionAccessor) (Object) ((org.bukkit.World) org.bukkit.Bukkit
					.getWorld("manhunt"))).getHighestBlockYAt(((Number) $31c7eb675dc4cdba2948be210c51abd7).intValue(),
							((Number) $cf0ba6185ddfc59ba81ec75dc0cbb4b2).intValue(),
							((org.bukkit.HeightMap) org.bukkit.HeightMap.MOTION_BLOCKING))));
			org.bukkit.Bukkit.broadcastMessage(
					String.valueOf(new org.bukkit.Location(((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")),
							((Number) $31c7eb675dc4cdba2948be210c51abd7).doubleValue(),
							((Number) $f1803b1540e7e0b45fe9bee8fdd4c855).doubleValue(),
							((Number) $cf0ba6185ddfc59ba81ec75dc0cbb4b2).doubleValue())));
			if (true)
				return new org.bukkit.Location(((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")),
						((Number) $31c7eb675dc4cdba2948be210c51abd7).doubleValue(),
						((Number) $f1803b1540e7e0b45fe9bee8fdd4c855).doubleValue(),
						((Number) $cf0ba6185ddfc59ba81ec75dc0cbb4b2).doubleValue());
		}
		if (function.equalsIgnoreCase("randomNearSpawn")) {
			Object $e7bcaaf40d851a015ade260daa86e020 = null;
			Object $5b66d8a3dbaf3db6a6bde7502c733260 = null;
			Object $e7fe1aba01e8166d8c78ae6b966dedd7 = null;
			Object $936222da3bb558848f700bb01edb34c0 = null;
			$5b66d8a3dbaf3db6a6bde7502c733260 = ((java.lang.Object) (Object) (20d));
			$936222da3bb558848f700bb01edb34c0 = ((java.lang.Object) (Object) java.util.concurrent.ThreadLocalRandom
					.current().nextInt(((int) (((Number) $5b66d8a3dbaf3db6a6bde7502c733260).doubleValue() * (-1d))),
							((Number) $5b66d8a3dbaf3db6a6bde7502c733260).intValue()));
			$e7fe1aba01e8166d8c78ae6b966dedd7 = ((java.lang.Object) (Object) ((long) Math
					.floor(Math.sqrt(((((Number) $5b66d8a3dbaf3db6a6bde7502c733260).doubleValue()
							* ((Number) $5b66d8a3dbaf3db6a6bde7502c733260).doubleValue())
							- (((Number) $936222da3bb558848f700bb01edb34c0).doubleValue()
									* ((Number) $936222da3bb558848f700bb01edb34c0).doubleValue()))))));
			if (java.util.concurrent.ThreadLocalRandom.current().nextBoolean()) {
				$e7fe1aba01e8166d8c78ae6b966dedd7 = ((java.lang.Object) (Object) (((Number) $e7fe1aba01e8166d8c78ae6b966dedd7)
						.doubleValue() * (-1d)));
			}
			$e7bcaaf40d851a015ade260daa86e020 = new org.bukkit.Location(
					((org.bukkit.World) ((org.bukkit.entity.Entity) (Object) functionArgs.get(((int) (0d))))
							.getWorld()),
					(((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
							.get(((int) (0d)))).getLocation()).getX())
							+ ((Number) $e7fe1aba01e8166d8c78ae6b966dedd7).doubleValue()),
					((double) ((int) ((org.bukkit.RegionAccessor) (Object) ((org.bukkit.World) ((org.bukkit.entity.Entity) (Object) functionArgs
							.get(((int) (0d)))).getWorld())).getHighestBlockYAt(
									((int) (((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
											.get(((int) (0d)))).getLocation()).getX())
											+ ((Number) $e7fe1aba01e8166d8c78ae6b966dedd7).doubleValue())),
									((int) (((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
											.get(((int) (0d)))).getLocation()).getZ())
											+ ((Number) $936222da3bb558848f700bb01edb34c0).doubleValue())),
									((org.bukkit.HeightMap) org.bukkit.HeightMap.MOTION_BLOCKING)))),
					(((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
							.get(((int) (0d)))).getLocation()).getZ())
							+ ((Number) $936222da3bb558848f700bb01edb34c0).doubleValue()));
			if (true)
				return $e7bcaaf40d851a015ade260daa86e020;
		}
		if (function.equalsIgnoreCase("trackPlayer")) {
			Object $121d029516073994e057639831c25980 = null;
			Object $0b2f93af7c8259eb0447305da351d42e = null;
			Object $68714194d13a5feb8826dd1adc4c7f19 = null;
			Object $897859f6655555855a890e51483ab5e6 = null;
			Object $395ad2ffcef07bd20d4d2d232b618e09 = null;
			Object $f8889b1f7fbcf1f942a789d44a22286c = null;
			Object $34c96218030747127518442dcdf79d57 = null;
			Object $c78f2fa048223694246eb6acb39bb15e = null;
			Object $76f74784cdf272cbdd1c37d471a532a0 = null;
			Object $c728a7436e8e4ede9155004ad8e51cae = null;
			if ((((boolean) ((org.bukkit.OfflinePlayer) (Object) functionArgs.get(((int) (0d)))).isOnline())
					&& ((boolean) ((org.bukkit.OfflinePlayer) (Object) functionArgs.get(((int) (1d)))).isOnline()))) {
				$395ad2ffcef07bd20d4d2d232b618e09 = ((org.bukkit.World) ((org.bukkit.entity.Entity) (Object) functionArgs
						.get(((int) (0d)))).getWorld());
				$121d029516073994e057639831c25980 = ((org.bukkit.World) ((org.bukkit.entity.Entity) (Object) functionArgs
						.get(((int) (1d)))).getWorld());
				$c78f2fa048223694246eb6acb39bb15e = new org.bukkit.Location(
						((org.bukkit.World) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
								.get(((int) (0d)))).getLocation()).getWorld()),
						((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
								.get(((int) (0d)))).getLocation()).getX()),
						(0d),
						((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
								.get(((int) (0d)))).getLocation()).getZ()),
						((float) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
								.get(((int) (0d)))).getLocation()).getYaw()),
						((float) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
								.get(((int) (0d)))).getLocation()).getPitch()));
				$c728a7436e8e4ede9155004ad8e51cae = new org.bukkit.Location(
						((org.bukkit.World) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
								.get(((int) (1d)))).getLocation()).getWorld()),
						((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
								.get(((int) (1d)))).getLocation()).getX()),
						(0d), ((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) functionArgs
								.get(((int) (1d)))).getLocation()).getZ()));
				if (!PluginMain.checkEquals($395ad2ffcef07bd20d4d2d232b618e09, $121d029516073994e057639831c25980)) {
					if (PluginMain.checkEquals(
							((org.bukkit.World.Environment) ((org.bukkit.generator.WorldInfo) (Object) $395ad2ffcef07bd20d4d2d232b618e09)
									.getEnvironment()),
							((org.bukkit.World.Environment) org.bukkit.World.Environment.NORMAL))) {
						$0b2f93af7c8259eb0447305da351d42e = PlayerDataManager.getInstance().getData(
								((org.bukkit.OfflinePlayer) (Object) functionArgs.get(((int) (1d)))), "oPortal");
						$c728a7436e8e4ede9155004ad8e51cae = new org.bukkit.Location(
								((org.bukkit.World) ((org.bukkit.Location) (Object) $0b2f93af7c8259eb0447305da351d42e)
										.getWorld()),
								((double) ((org.bukkit.Location) (Object) $0b2f93af7c8259eb0447305da351d42e).getX()),
								(0d),
								((double) ((org.bukkit.Location) (Object) $0b2f93af7c8259eb0447305da351d42e).getZ()));
					} else if (PluginMain.checkEquals(
							((org.bukkit.World.Environment) ((org.bukkit.generator.WorldInfo) (Object) $395ad2ffcef07bd20d4d2d232b618e09)
									.getEnvironment()),
							((org.bukkit.World.Environment) org.bukkit.World.Environment.NETHER))) {
						$0b2f93af7c8259eb0447305da351d42e = PlayerDataManager.getInstance().getData(
								((org.bukkit.OfflinePlayer) (Object) functionArgs.get(((int) (1d)))), "nPortal");
						$c728a7436e8e4ede9155004ad8e51cae = new org.bukkit.Location(
								((org.bukkit.World) ((org.bukkit.Location) (Object) $0b2f93af7c8259eb0447305da351d42e)
										.getWorld()),
								((double) ((org.bukkit.Location) (Object) $0b2f93af7c8259eb0447305da351d42e).getX()),
								(0d),
								((double) ((org.bukkit.Location) (Object) $0b2f93af7c8259eb0447305da351d42e).getZ()));
					} else {
						if (true)
							return new ArrayList(Arrays.asList("\u2022", "?"));
					}
				}
				$f8889b1f7fbcf1f942a789d44a22286c = ((java.lang.Object) (Object) Math
						.round(((double) ((org.bukkit.Location) (Object) $c728a7436e8e4ede9155004ad8e51cae)
								.distance(((org.bukkit.Location) (Object) $c78f2fa048223694246eb6acb39bb15e)))));
				$34c96218030747127518442dcdf79d57 = ((org.bukkit.util.Vector) ((org.bukkit.util.Vector) ((org.bukkit.Location) ((org.bukkit.Location) (Object) $c728a7436e8e4ede9155004ad8e51cae)
						.subtract(((org.bukkit.Location) (Object) $c78f2fa048223694246eb6acb39bb15e))).toVector())
								.normalize());
				$76f74784cdf272cbdd1c37d471a532a0 = ((org.bukkit.util.Vector) ((org.bukkit.Location) (Object) $c78f2fa048223694246eb6acb39bb15e)
						.getDirection());
				$897859f6655555855a890e51483ab5e6 = ((java.lang.Object) (Object) ((((Number) Math.atan2(
						((double) ((org.bukkit.util.Vector) (Object) $76f74784cdf272cbdd1c37d471a532a0).getX()),
						((double) ((org.bukkit.util.Vector) (Object) $76f74784cdf272cbdd1c37d471a532a0).getZ())))
								.doubleValue()
						* (180d)) / Math.PI));
				$897859f6655555855a890e51483ab5e6 = ((java.lang.Object) (Object) (((Number) $897859f6655555855a890e51483ab5e6)
						.doubleValue()
						- ((((Number) Math.atan2(
								((double) ((org.bukkit.util.Vector) (Object) $34c96218030747127518442dcdf79d57).getX()),
								((double) ((org.bukkit.util.Vector) (Object) $34c96218030747127518442dcdf79d57)
										.getZ()))).doubleValue()
								* (180d)) / Math.PI)));
				if ((((Number) $897859f6655555855a890e51483ab5e6).doubleValue() < (0d))) {
					$897859f6655555855a890e51483ab5e6 = ((java.lang.Object) (Object) ((long) Math
							.ceil((((Number) $897859f6655555855a890e51483ab5e6).doubleValue() + (22.5d)))));
				} else {
					$897859f6655555855a890e51483ab5e6 = ((java.lang.Object) (Object) ((long) Math
							.floor((((Number) $897859f6655555855a890e51483ab5e6).doubleValue() + (22.5d)))));
				}
				$897859f6655555855a890e51483ab5e6 = ((java.lang.Object) (Object) (((Number) $897859f6655555855a890e51483ab5e6)
						.doubleValue() % (360d)));
				if ((((Number) $897859f6655555855a890e51483ab5e6).doubleValue() < (0d))) {
					$897859f6655555855a890e51483ab5e6 = ((java.lang.Object) (Object) (((Number) $897859f6655555855a890e51483ab5e6)
							.doubleValue() + (360d)));
				}
				$68714194d13a5feb8826dd1adc4c7f19 = ((java.lang.Object) (Object) ((char) "\u2B06\u2B08\u27A1\u2B0A\u2B07\u2B0B\u2B05\u2B09"
						.charAt(((int) ((long) Math
								.floor((((Number) $897859f6655555855a890e51483ab5e6).doubleValue() / (45d))))))));
				if (true)
					return new ArrayList(
							Arrays.asList($68714194d13a5feb8826dd1adc4c7f19, $f8889b1f7fbcf1f942a789d44a22286c));
			} else {
				if (true)
					return new ArrayList(Arrays.asList("\u2022", "?"));
			}
		}
		if (function.equalsIgnoreCase("spawnAlgorithm")) {
			Object $5b66d8a3dbaf3db6a6bde7502c733260 = null;
			Object $e7fe1aba01e8166d8c78ae6b966dedd7 = null;
			Object $936222da3bb558848f700bb01edb34c0 = null;
			Object $cf136642910b7619641add810549639b = null;
			Object $514167926092e79f492e29b3632b9cda = null;
			$5b66d8a3dbaf3db6a6bde7502c733260 = ((java.lang.Object) (Object) (1d));
			while (($514167926092e79f492e29b3632b9cda == null)) {
				$e7fe1aba01e8166d8c78ae6b966dedd7 = ((java.lang.Object) (Object) Math
						.round(java.util.concurrent.ThreadLocalRandom.current().nextDouble(
								(((Number) $5b66d8a3dbaf3db6a6bde7502c733260).doubleValue() * (-1d)),
								((Number) $5b66d8a3dbaf3db6a6bde7502c733260).doubleValue())));
				$936222da3bb558848f700bb01edb34c0 = ((java.lang.Object) (Object) Math
						.round(java.util.concurrent.ThreadLocalRandom.current().nextDouble(
								(((Number) $5b66d8a3dbaf3db6a6bde7502c733260).doubleValue() * (-1d)),
								((Number) $5b66d8a3dbaf3db6a6bde7502c733260).doubleValue())));
				$cf136642910b7619641add810549639b = ((java.lang.Object) (Object) ((int) ((org.bukkit.RegionAccessor) (Object) functionArgs
						.get(((int) (0d)))).getHighestBlockYAt(((Number) $e7fe1aba01e8166d8c78ae6b966dedd7).intValue(),
								((Number) $936222da3bb558848f700bb01edb34c0).intValue(),
								((org.bukkit.HeightMap) org.bukkit.HeightMap.MOTION_BLOCKING))));
				if (((boolean) ((org.bukkit.Material) ((org.bukkit.block.Block) new org.bukkit.Location(
						((org.bukkit.World) (Object) functionArgs.get(((int) (0d)))),
						((Number) $e7fe1aba01e8166d8c78ae6b966dedd7).doubleValue(),
						((Number) $cf136642910b7619641add810549639b).doubleValue(),
						((Number) $936222da3bb558848f700bb01edb34c0).doubleValue()).getBlock()).getType()).isSolid())) {
					$514167926092e79f492e29b3632b9cda = new org.bukkit.Location(
							((org.bukkit.World) (Object) functionArgs.get(((int) (0d)))),
							((Number) $e7fe1aba01e8166d8c78ae6b966dedd7).doubleValue(),
							(((Number) $cf136642910b7619641add810549639b).doubleValue() + (1d)),
							((Number) $936222da3bb558848f700bb01edb34c0).doubleValue());
					if (true)
						return $514167926092e79f492e29b3632b9cda;
				}
				$5b66d8a3dbaf3db6a6bde7502c733260 = ((java.lang.Object) (Object) (((Number) $5b66d8a3dbaf3db6a6bde7502c733260)
						.doubleValue() + (10d)));
			}
			if (true)
				return new org.bukkit.Location(((org.bukkit.World) (Object) functionArgs.get(((int) (0d)))), (0d),
						(((double) ((int) ((org.bukkit.RegionAccessor) (Object) functionArgs.get(((int) (0d))))
								.getHighestBlockYAt(((int) (0d)), ((int) (0d)),
										((org.bukkit.HeightMap) org.bukkit.HeightMap.OCEAN_FLOOR))))
								+ (1d)),
						(0d));
		}
		return null;
	}

	public static List createList(Object obj) {
		if (obj instanceof List) {
			return (List) obj;
		}
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event1(org.bukkit.event.player.PlayerPortalEvent event) throws Exception {
		if (PluginMain.checkEquals(
				((org.bukkit.World.Environment) ((org.bukkit.generator.WorldInfo) (Object) ((org.bukkit.World) ((org.bukkit.entity.Entity) (Object) ((org.bukkit.entity.Player) event
						.getPlayer())).getWorld())).getEnvironment()),
				((org.bukkit.World.Environment) org.bukkit.World.Environment.NORMAL))) {
			PlayerDataManager.getInstance().setData(
					((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event.getPlayer())), "oPortal",
					((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) ((org.bukkit.entity.Player) event
							.getPlayer())).getLocation()));
		} else if (PluginMain.checkEquals(
				((org.bukkit.World.Environment) ((org.bukkit.generator.WorldInfo) (Object) ((org.bukkit.World) ((org.bukkit.entity.Entity) (Object) ((org.bukkit.entity.Player) event
						.getPlayer())).getWorld())).getEnvironment()),
				((org.bukkit.World.Environment) org.bukkit.World.Environment.NETHER))) {
			PlayerDataManager.getInstance().setData(
					((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event.getPlayer())), "nPortal",
					((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) ((org.bukkit.entity.Player) event
							.getPlayer())).getLocation()));
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event2(org.bukkit.event.player.PlayerJoinEvent event) throws Exception {
		if (((!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameRegenerates"))) && ((((!((boolean) String
				.valueOf(((org.bukkit.World) ((org.bukkit.entity.Entity) (Object) ((org.bukkit.entity.Player) event
						.getPlayer())).getWorld()))
				.contains(String.valueOf("manhunt"))))
				&& (!(((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt")) == null)))
				|| (!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted"))))
				|| (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted"))
						&& (((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
								.getScoreboardManager()).getMainScoreboard()).getPlayerTeam(
										((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event
												.getPlayer())))) == null))))) {
			((org.bukkit.entity.Entity) (Object) ((org.bukkit.entity.Player) event.getPlayer()))
					.teleport(((org.bukkit.Location) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
							.getSpawnLocation()));
			((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
					.getScoreboardManager()).getMainScoreboard()).getTeam("Spectator")).addPlayer(
							((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event.getPlayer())));
			new org.bukkit.scheduler.BukkitRunnable() {
				public void run() {
					try {
						((org.bukkit.entity.HumanEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer()))
								.setGameMode(((org.bukkit.GameMode) org.bukkit.GameMode.SPECTATOR));
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}.runTaskLater(PluginMain.getInstance(), ((long) (3d)));
		}
		if (!((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
			((org.bukkit.entity.Player) event.getPlayer()).setAllowFlight(false);
		} else {
			((org.bukkit.entity.Player) event.getPlayer()).setAllowFlight(true);
		}
	}

	@EventHandler
	public void onGUIClick(GUIClickEvent event) throws Exception {
		if (event.getID().equalsIgnoreCase("settings")) {
			Object $ebda08fcdf95ce673ac70be02c22e003 = null;
			if ((((!(event.getCurrentItem() == null))
					&& (!(((java.lang.String) ((org.bukkit.inventory.meta.ItemMeta) event.getCurrentItem()
							.getItemMeta()).getDisplayName()) == null)))
					&& ((boolean) event.getClick().isLeftClick()))) {
				$ebda08fcdf95ce673ac70be02c22e003 = ((java.lang.String) ((org.bukkit.inventory.meta.ItemMeta) event
						.getCurrentItem().getItemMeta()).getDisplayName());
				if (((boolean) String.valueOf($ebda08fcdf95ce673ac70be02c22e003).contains(String.valueOf("Tracker")))) {
					if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingTracker"))) {
						PluginMain.PERSISTENT_VARIABLES.set("settingTracker", ((java.lang.Object) (Object) false));
					} else {
						PluginMain.PERSISTENT_VARIABLES.set("settingTracker", ((java.lang.Object) (Object) true));
					}
				} else if (((boolean) String.valueOf($ebda08fcdf95ce673ac70be02c22e003)
						.contains(String.valueOf("Bed bomb")))) {
					if (PluginMain.checkEquals(PluginMain.PERSISTENT_VARIABLES.get("settingBed"), "reduced")) {
						PluginMain.PERSISTENT_VARIABLES.set("settingBed", "vanilla");
					} else if (PluginMain.checkEquals(PluginMain.PERSISTENT_VARIABLES.get("settingBed"), "vanilla")) {
						PluginMain.PERSISTENT_VARIABLES.set("settingBed", "disabled");
					} else {
						PluginMain.PERSISTENT_VARIABLES.set("settingBed", "reduced");
					}
				} else if (((boolean) String.valueOf($ebda08fcdf95ce673ac70be02c22e003)
						.contains(String.valueOf("Hunter's spawn")))) {
					if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingSpawn"))) {
						PluginMain.PERSISTENT_VARIABLES.set("settingSpawn", ((java.lang.Object) (Object) false));
					} else {
						PluginMain.PERSISTENT_VARIABLES.set("settingSpawn", ((java.lang.Object) (Object) true));
					}
				} else if (((boolean) String.valueOf($ebda08fcdf95ce673ac70be02c22e003)
						.contains(String.valueOf("Friendly fire")))) {
					if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingFriendly"))) {
						PluginMain.PERSISTENT_VARIABLES.set("settingFriendly", ((java.lang.Object) (Object) false));
					} else {
						PluginMain.PERSISTENT_VARIABLES.set("settingFriendly", ((java.lang.Object) (Object) true));
					}
				} else if (((boolean) String.valueOf($ebda08fcdf95ce673ac70be02c22e003)
						.contains(String.valueOf("Chat")))) {
					if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingChat"))) {
						PluginMain.PERSISTENT_VARIABLES.set("settingChat", ((java.lang.Object) (Object) false));
					} else {
						PluginMain.PERSISTENT_VARIABLES.set("settingChat", ((java.lang.Object) (Object) true));
					}
				} else if (((boolean) String.valueOf($ebda08fcdf95ce673ac70be02c22e003)
						.contains(String.valueOf("Blazes")))) {
					if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingBlazes"))) {
						PluginMain.PERSISTENT_VARIABLES.set("settingBlazes", ((java.lang.Object) (Object) false));
					} else {
						PluginMain.PERSISTENT_VARIABLES.set("settingBlazes", ((java.lang.Object) (Object) true));
					}
				} else if (((boolean) String.valueOf($ebda08fcdf95ce673ac70be02c22e003)
						.contains(String.valueOf("Enderman")))) {
					if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingEnderman"))) {
						PluginMain.PERSISTENT_VARIABLES.set("settingEnderman", ((java.lang.Object) (Object) false));
					} else {
						PluginMain.PERSISTENT_VARIABLES.set("settingEnderman", ((java.lang.Object) (Object) true));
					}
				} else if (((boolean) String.valueOf($ebda08fcdf95ce673ac70be02c22e003)
						.contains(String.valueOf("Piglins")))) {
					if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingPiglins"))) {
						PluginMain.PERSISTENT_VARIABLES.set("settingPiglins", ((java.lang.Object) (Object) false));
					} else {
						PluginMain.PERSISTENT_VARIABLES.set("settingPiglins", ((java.lang.Object) (Object) true));
					}
				}
				new org.bukkit.scheduler.BukkitRunnable() {
					public void run() {
						try {
							GUIManager.getInstance().open("settings",
									((org.bukkit.entity.Player) event.getWhoClicked()));
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				}.runTaskLater(PluginMain.getInstance(), ((long) (1d)));
			}
			return;
		}
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void event3(org.bukkit.event.player.PlayerMoveEvent event) throws Exception {
		if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event4(org.bukkit.event.entity.EntityDamageEvent event) throws Exception {
		if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event5(org.bukkit.event.player.PlayerInteractEvent event) throws Exception {
		if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event6(org.bukkit.event.block.BlockPlaceEvent event) throws Exception {
		if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event7(org.bukkit.event.entity.EntityExplodeEvent event) throws Exception {
		if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event8(org.bukkit.event.player.PlayerDropItemEvent event) throws Exception {
		if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event9(org.bukkit.event.entity.PlayerDeathEvent event) throws Exception {
		if (PluginMain.checkEquals(
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getPlayerTeam(
								((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Entity) event.getEntity())))),
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Runner")))) {
			((org.bukkit.entity.HumanEntity) (Object) ((org.bukkit.entity.Entity) event.getEntity()))
					.setGameMode(((org.bukkit.GameMode) org.bukkit.GameMode.SPECTATOR));
			((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
					.getScoreboardManager()).getMainScoreboard()).getTeam("Spectator")).addPlayer(
							((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Entity) event.getEntity())));
		}
		if (PluginMain.checkEquals(((java.lang.Object) (Object) ((int) PluginMain.createList(
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Runner")).getPlayers())
				.size())), ((java.lang.Object) (Object) (0d)))) {
			org.bukkit.Bukkit.broadcastMessage(
					ChatColor.translateAlternateColorCodes('&', "Finished &7\u2192 &b&lHunters Won!"));
			PluginMain.PERSISTENT_VARIABLES.set("gameStarted", ((java.lang.Object) (Object) false));
			for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
				if (((boolean) ((org.bukkit.permissions.ServerOperator) (Object) FINAL_loopValue1).isOp())) {
					((org.bukkit.command.CommandSender) (Object) FINAL_loopValue1).sendMessage(
							ChatColor.translateAlternateColorCodes('&', "Wanna restart? &7\u2192 &b&l/regen"));
				}
			}
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event10(org.bukkit.event.entity.EntityDeathEvent event) throws Exception {
		if (PluginMain.checkEquals(
				((org.bukkit.entity.EntityType) ((org.bukkit.entity.Entity) event.getEntity()).getType()),
				((org.bukkit.entity.EntityType) org.bukkit.entity.EntityType.ENDER_DRAGON))) {
			org.bukkit.Bukkit.broadcastMessage(
					ChatColor.translateAlternateColorCodes('&', "Finished &7\u2192 &b&lRunners Won!"));
			PluginMain.PERSISTENT_VARIABLES.set("gameStarted", ((java.lang.Object) (Object) false));
			for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
				if (((boolean) ((org.bukkit.permissions.ServerOperator) (Object) FINAL_loopValue1).isOp())) {
					((org.bukkit.command.CommandSender) (Object) FINAL_loopValue1).sendMessage(
							ChatColor.translateAlternateColorCodes('&', "Wanna restart? &7\u2192 &b&l/regen"));
				}
			}
		} else if ((PluginMain.checkEquals(
				((org.bukkit.entity.EntityType) ((org.bukkit.entity.Entity) event.getEntity()).getType()),
				((org.bukkit.entity.EntityType) org.bukkit.entity.EntityType.ENDERMAN))
				&& ((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingEnderman")))) {
			for (Object FINAL_loopValue1 : ((List) event.getDrops())) {
				if (PluginMain.checkEquals(
						((org.bukkit.Material) ((org.bukkit.inventory.ItemStack) (Object) FINAL_loopValue1).getType()),
						((org.bukkit.Material) org.bukkit.Material.ENDER_PEARL))) {
					((List) event.getDrops()).remove(FINAL_loopValue1);
				}
			}
			((List) event.getDrops())
					.add(new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.ENDER_PEARL),
							java.util.concurrent.ThreadLocalRandom.current().nextInt(((int) (1d)), ((int) (3d)))));
		} else if ((PluginMain.checkEquals(
				((org.bukkit.entity.EntityType) ((org.bukkit.entity.Entity) event.getEntity()).getType()),
				((org.bukkit.entity.EntityType) org.bukkit.entity.EntityType.BLAZE))
				&& ((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingBlazes")))) {
			for (Object FINAL_loopValue1 : ((List) event.getDrops())) {
				if (PluginMain.checkEquals(
						((org.bukkit.Material) ((org.bukkit.inventory.ItemStack) (Object) FINAL_loopValue1).getType()),
						((org.bukkit.Material) org.bukkit.Material.BLAZE_ROD))) {
					((List) event.getDrops()).remove(FINAL_loopValue1);
				}
			}
			((List) event.getDrops())
					.add(new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.BLAZE_ROD),
							java.util.concurrent.ThreadLocalRandom.current().nextInt(((int) (1d)), ((int) (3d)))));
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event11(org.bukkit.event.entity.FoodLevelChangeEvent event) throws Exception {
		if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event12(org.bukkit.event.entity.SpawnerSpawnEvent event) throws Exception {
		if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event13(org.bukkit.event.inventory.InventoryClickEvent event) throws Exception {
		if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gamePaused"))) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event14(org.bukkit.event.player.PlayerQuitEvent event) throws Exception {
		if (PluginMain.checkEquals(PluginMain.PERSISTENT_VARIABLES.get("gameStarted"),
				((java.lang.Object) (Object) false))) {
			if (!(((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
					.getScoreboardManager()).getMainScoreboard())
							.getPlayerTeam(((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event
									.getPlayer())))) == null)) {
				((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getPlayerTeam(
								((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event.getPlayer()))))
										.removePlayer(
												((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event
														.getPlayer())));
			}
		} else if ((((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted"))
				&& ((boolean) ((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Runner"))
								.hasPlayer(((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event
										.getPlayer())))))) {
			PluginMain.procedure("pauseGameAsConsole", new ArrayList());
			org.bukkit.Bukkit.broadcastMessage(
					ChatColor.translateAlternateColorCodes('&', "Runner disconnected &7\u2192 &b&lPaused the game"));
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event15(org.bukkit.event.player.PlayerRespawnEvent event) throws Exception {
		Object $f8889b1f7fbcf1f942a789d44a22286c = null;
		Object $248e12a07a95968d715174d47662caef = null;
		Object $0e00620a53ec7045e25fc2ea866a88e5 = null;
		Object $0b731c2ddc6ce7eb8fa8e6fa6e9b1c67 = null;
		Object $84593c80ae02844ce56cda6189577ea8 = null;
		Object $3ad416af521a05e66326b8d433fb8bb3 = null;
		Object $c75894d7647e2071a838b0b45758add0 = null;
		if ((((((((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingSpawn"))
				&& ((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted")))
				&& ((boolean) ((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Hunter")).hasPlayer(
								((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event.getPlayer())))))
				&& (((org.bukkit.Location) ((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event
						.getPlayer())).getBedSpawnLocation()) == null))
				&& (!((boolean) event.isAnchorSpawn())))
				&& (!((boolean) PluginMain.createList(
						((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
								.getScoreboardManager()).getMainScoreboard()).getTeam("Runner")).getPlayers())
						.isEmpty())))) {
			org.bukkit.Bukkit.broadcastMessage("RESPAWNEVENT - VERIFICATIONS DONE!");
			$0e00620a53ec7045e25fc2ea866a88e5 = new org.bukkit.Location(
					((org.bukkit.World) ((org.bukkit.entity.Entity) (Object) ((org.bukkit.entity.Player) event
							.getPlayer())).getWorld()),
					((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) ((org.bukkit.entity.Player) event
							.getPlayer())).getLocation()).getX()),
					(0d),
					((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) ((org.bukkit.entity.Player) event
							.getPlayer())).getLocation()).getZ()));
			$0b731c2ddc6ce7eb8fa8e6fa6e9b1c67 = new ArrayList();
			for (Object FINAL_loopValue1 : ((List) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
					.getPlayers())) {
				if (((boolean) ((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getTeam("Runner"))
								.hasPlayer(((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1)))) {
					((java.util.List) (Object) $0b731c2ddc6ce7eb8fa8e6fa6e9b1c67).add(FINAL_loopValue1);
				}
			}
			if (PluginMain.checkEquals(
					((org.bukkit.World.Environment) ((org.bukkit.generator.WorldInfo) (Object) ((org.bukkit.World) ((org.bukkit.entity.Entity) (Object) ((org.bukkit.entity.Player) event
							.getPlayer())).getWorld())).getEnvironment()),
					((org.bukkit.World.Environment) org.bukkit.World.Environment.NORMAL))) {
				if (((boolean) ((java.util.List) (Object) $0b731c2ddc6ce7eb8fa8e6fa6e9b1c67).isEmpty())) {
					org.bukkit.Bukkit.broadcastMessage("RESPAWNEVENT - OVERWORLD DEATH, NO RUNNERS");
					$f8889b1f7fbcf1f942a789d44a22286c = ((java.lang.Object) (Object) (9999999999999999999999d));
					for (Object FINAL_loopValue1 : PluginMain.createList(
							((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
									.getScoreboardManager()).getMainScoreboard()).getTeam("Runner")).getPlayers())) {
						$248e12a07a95968d715174d47662caef = PlayerDataManager.getInstance()
								.getData(((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1), "oPortal");
						if ((((double) ((org.bukkit.Location) (Object) $0e00620a53ec7045e25fc2ea866a88e5)
								.distance(new org.bukkit.Location(
										((org.bukkit.World) ((org.bukkit.Location) (Object) $248e12a07a95968d715174d47662caef)
												.getWorld()),
										((double) ((org.bukkit.Location) (Object) $248e12a07a95968d715174d47662caef)
												.getX()),
										(0d),
										((double) ((org.bukkit.Location) (Object) $248e12a07a95968d715174d47662caef)
												.getZ())))) < ((Number) $f8889b1f7fbcf1f942a789d44a22286c)
														.doubleValue())) {
							$f8889b1f7fbcf1f942a789d44a22286c = ((java.lang.Object) (Object) ((double) ((org.bukkit.Location) (Object) $0e00620a53ec7045e25fc2ea866a88e5)
									.distance(new org.bukkit.Location(
											((org.bukkit.World) ((org.bukkit.Location) (Object) $248e12a07a95968d715174d47662caef)
													.getWorld()),
											((double) ((org.bukkit.Location) (Object) $248e12a07a95968d715174d47662caef)
													.getX()),
											(0d),
											((double) ((org.bukkit.Location) (Object) $248e12a07a95968d715174d47662caef)
													.getZ())))));
							$3ad416af521a05e66326b8d433fb8bb3 = PlayerDataManager.getInstance()
									.getData(((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1), "oPortal");
						}
					}
					if ((((double) ((org.bukkit.Location) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
							.getSpawnLocation()).distance(new org.bukkit.Location(
									((org.bukkit.World) ((org.bukkit.Location) (Object) $248e12a07a95968d715174d47662caef)
											.getWorld()),
									((double) ((org.bukkit.Location) (Object) $248e12a07a95968d715174d47662caef)
											.getX()),
									(0d), ((double) ((org.bukkit.Location) (Object) $248e12a07a95968d715174d47662caef)
											.getZ())))) > (600d))) {
						event.setRespawnLocation(((org.bukkit.Location) (Object) PluginMain.function("nearestSpawn",
								new ArrayList(Arrays.asList($3ad416af521a05e66326b8d433fb8bb3,
										$0e00620a53ec7045e25fc2ea866a88e5)))));
					}
				} else {
					org.bukkit.Bukkit.broadcastMessage("RESPAWNEVENT - OVERWORLD DEATH, RUNNERS");
					$f8889b1f7fbcf1f942a789d44a22286c = ((java.lang.Object) (Object) (9999999999999999999999d));
					for (Object FINAL_loopValue1 : PluginMain.createList(
							((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
									.getScoreboardManager()).getMainScoreboard()).getTeam("Runner")).getPlayers())) {
						$c75894d7647e2071a838b0b45758add0 = ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
								.getLocation());
						if ((((double) ((org.bukkit.Location) (Object) $0e00620a53ec7045e25fc2ea866a88e5)
								.distance(new org.bukkit.Location(
										((org.bukkit.World) ((org.bukkit.Location) (Object) $c75894d7647e2071a838b0b45758add0)
												.getWorld()),
										((double) ((org.bukkit.Location) (Object) $c75894d7647e2071a838b0b45758add0)
												.getX()),
										(0d),
										((double) ((org.bukkit.Location) (Object) $c75894d7647e2071a838b0b45758add0)
												.getZ())))) < ((Number) $f8889b1f7fbcf1f942a789d44a22286c)
														.doubleValue())) {
							$f8889b1f7fbcf1f942a789d44a22286c = ((java.lang.Object) (Object) ((double) ((org.bukkit.Location) (Object) $0e00620a53ec7045e25fc2ea866a88e5)
									.distance(new org.bukkit.Location(
											((org.bukkit.World) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
													.getLocation()).getWorld()),
											((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
													.getLocation()).getX()),
											(0d),
											((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
													.getLocation()).getZ())))));
							$84593c80ae02844ce56cda6189577ea8 = new org.bukkit.Location(
									((org.bukkit.World) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
											.getLocation()).getWorld()),
									((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
											.getLocation()).getX()),
									(0d),
									((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
											.getLocation()).getZ()));
						}
					}
					org.bukkit.Bukkit.broadcastMessage(String.valueOf(
							(((double) ((org.bukkit.Location) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
									.getSpawnLocation()).distance(
											((org.bukkit.Location) (Object) $84593c80ae02844ce56cda6189577ea8))) > (600d))));
					if ((((double) ((org.bukkit.Location) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
							.getSpawnLocation()).distance(
									((org.bukkit.Location) (Object) $84593c80ae02844ce56cda6189577ea8))) > (600d))) {
						event.setRespawnLocation(((org.bukkit.Location) (Object) PluginMain.function("nearestSpawn",
								new ArrayList(Arrays.asList($84593c80ae02844ce56cda6189577ea8,
										$0e00620a53ec7045e25fc2ea866a88e5)))));
					}
				}
			} else {
				if (((boolean) ((java.util.List) (Object) $0b731c2ddc6ce7eb8fa8e6fa6e9b1c67).isEmpty())) {
					org.bukkit.Bukkit.broadcastMessage("RESPAWNEVENT - NO OVERWORLD DEATH, NO RUNNERS");
					if ((((double) ((org.bukkit.Location) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
							.getSpawnLocation())
									.distance(((org.bukkit.Location) (Object) PlayerDataManager.getInstance().getData(
											((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event
													.getPlayer())),
											"oPortal")))) > (600d))) {
						event.setRespawnLocation(((org.bukkit.Location) (Object) PluginMain.function("randomNearSpawn",
								new ArrayList(Arrays.asList(PlayerDataManager.getInstance()
										.getData(((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event
												.getPlayer())), "oPortal"))))));
					}
				} else {
					org.bukkit.Bukkit.broadcastMessage("RESPAWNEVENT - NO OVERWORLD DEATH, RUNNERS");
					$f8889b1f7fbcf1f942a789d44a22286c = ((java.lang.Object) (Object) (9999999999999999999999d));
					for (Object FINAL_loopValue1 : PluginMain.createList(
							((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
									.getScoreboardManager()).getMainScoreboard()).getTeam("Runner")).getPlayers())) {
						$c75894d7647e2071a838b0b45758add0 = ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
								.getLocation());
						if ((((double) ((org.bukkit.Location) (Object) PlayerDataManager.getInstance().getData(
								((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event.getPlayer())),
								"oPortal")).distance(new org.bukkit.Location(
										((org.bukkit.World) ((org.bukkit.Location) (Object) $c75894d7647e2071a838b0b45758add0)
												.getWorld()),
										((double) ((org.bukkit.Location) (Object) $c75894d7647e2071a838b0b45758add0)
												.getX()),
										(0d),
										((double) ((org.bukkit.Location) (Object) $c75894d7647e2071a838b0b45758add0)
												.getZ())))) < ((Number) $f8889b1f7fbcf1f942a789d44a22286c)
														.doubleValue())) {
							$f8889b1f7fbcf1f942a789d44a22286c = ((java.lang.Object) (Object) ((double) ((org.bukkit.Location) (Object) $0e00620a53ec7045e25fc2ea866a88e5)
									.distance(new org.bukkit.Location(
											((org.bukkit.World) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
													.getLocation()).getWorld()),
											((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
													.getLocation()).getX()),
											(0d),
											((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
													.getLocation()).getZ())))));
							$84593c80ae02844ce56cda6189577ea8 = new org.bukkit.Location(
									((org.bukkit.World) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
											.getLocation()).getWorld()),
									((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
											.getLocation()).getX()),
									(0d),
									((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) FINAL_loopValue1)
											.getLocation()).getZ()));
						}
					}
					if ((((double) ((org.bukkit.Location) ((org.bukkit.World) org.bukkit.Bukkit.getWorld("manhunt"))
							.getSpawnLocation()).distance(
									((org.bukkit.Location) (Object) $84593c80ae02844ce56cda6189577ea8))) > (600d))) {
						event.setRespawnLocation(((org.bukkit.Location) (Object) PluginMain.function("nearestSpawn",
								new ArrayList(Arrays.asList($84593c80ae02844ce56cda6189577ea8,
										PlayerDataManager.getInstance().getData(
												((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event
														.getPlayer())),
												"oPortal"))))));
					}
				}
			}
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event16(org.bukkit.event.entity.PiglinBarterEvent event) throws Exception {
		Object $ed56fefd0444331b59eb494f1d8d5f07 = null;
		Object $966af032a6af484f92504feaf9a6a9c4 = null;
		Object $cd36472beaf76ec48aaeefb32867d0e0 = null;
		Object $7de5983e9f2fbeb81dd89b6794a9655e = null;
		Object $7be568da2b13d7a71adcafe0118fec6d = null;
		Object $bc46aae399a7e8584da04e4f4489fc9e = null;
		Object $03db7bffaa8699bf91f7595c79de9f01 = null;
		Object $4cc6b037fa2bd0d2f19f80b677a143b7 = null;
		Object $d811d0ca50d4b57f0e7b774700e0c21a = null;
		Object $21b1d0573229f3ae320b7e2f623dcc66 = null;
		Object $0e2ce1f6daff7ac1cb3b6af91fd08922 = null;
		Object $0109155ad0b50b06977432d03cbcacaf = null;
		if (((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingPiglins"))) {
			$7be568da2b13d7a71adcafe0118fec6d = ITEM_388f32faac334151fcd8270288946915;
			$0e2ce1f6daff7ac1cb3b6af91fd08922 = ITEM_af5d4057580eb9982513de8bc5ef6b0d;
			$4cc6b037fa2bd0d2f19f80b677a143b7 = ITEM_af5d4057580eb9982513de8bc5ef6b0d;
			$03db7bffaa8699bf91f7595c79de9f01 = ITEM_eff303938aa8501a770b32d2b2aae453;
			$d811d0ca50d4b57f0e7b774700e0c21a = ITEM_e571647d5603226c242cf0e1a5b65981;
			$bc46aae399a7e8584da04e4f4489fc9e = new org.bukkit.inventory.ItemStack(
					((org.bukkit.Material) org.bukkit.Material.IRON_NUGGET),
					java.util.concurrent.ThreadLocalRandom.current().nextInt(((int) (15d)), ((int) (40d))));
			$0109155ad0b50b06977432d03cbcacaf = new org.bukkit.inventory.ItemStack(
					((org.bukkit.Material) org.bukkit.Material.ENDER_PEARL),
					java.util.concurrent.ThreadLocalRandom.current().nextInt(((int) (2d)), ((int) (6d))));
			$ed56fefd0444331b59eb494f1d8d5f07 = new org.bukkit.inventory.ItemStack(
					((org.bukkit.Material) org.bukkit.Material.SPECTRAL_ARROW),
					java.util.concurrent.ThreadLocalRandom.current().nextInt(((int) (12d)), ((int) (24d))));
			$21b1d0573229f3ae320b7e2f623dcc66 = new org.bukkit.inventory.ItemStack(
					((org.bukkit.Material) org.bukkit.Material.OBSIDIAN),
					java.util.concurrent.ThreadLocalRandom.current().nextInt(((int) (1d)), ((int) (3d))));
			$966af032a6af484f92504feaf9a6a9c4 = new org.bukkit.inventory.ItemStack(
					((org.bukkit.Material) org.bukkit.Material.BLACKSTONE),
					java.util.concurrent.ThreadLocalRandom.current().nextInt(((int) (16d)), ((int) (32d))));
			$cd36472beaf76ec48aaeefb32867d0e0 = new org.bukkit.inventory.ItemStack(
					((org.bukkit.Material) org.bukkit.Material.STRING),
					java.util.concurrent.ThreadLocalRandom.current().nextInt(((int) (6d)), ((int) (16d))));
			$7de5983e9f2fbeb81dd89b6794a9655e = new ArrayList(Arrays.asList($7be568da2b13d7a71adcafe0118fec6d,
					$0e2ce1f6daff7ac1cb3b6af91fd08922, $4cc6b037fa2bd0d2f19f80b677a143b7,
					$03db7bffaa8699bf91f7595c79de9f01, $d811d0ca50d4b57f0e7b774700e0c21a,
					$21b1d0573229f3ae320b7e2f623dcc66, $966af032a6af484f92504feaf9a6a9c4,
					$cd36472beaf76ec48aaeefb32867d0e0, $ed56fefd0444331b59eb494f1d8d5f07,
					$0109155ad0b50b06977432d03cbcacaf, $0109155ad0b50b06977432d03cbcacaf,
					$bc46aae399a7e8584da04e4f4489fc9e, $bc46aae399a7e8584da04e4f4489fc9e));
			((List) event.getOutcome()).set(((int) (0d)),
					((java.util.List) (Object) $7de5983e9f2fbeb81dd89b6794a9655e)
							.get(java.util.concurrent.ThreadLocalRandom.current()
									.nextInt(((java.util.List) (Object) $7de5983e9f2fbeb81dd89b6794a9655e).size())));
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event17(org.bukkit.event.player.PlayerChatEvent event) throws Exception {
		Object $ec22296c4355b48e40198f30b352ff73 = null;
		if (((((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("settingChat"))
				&& ((boolean) (Object) PluginMain.PERSISTENT_VARIABLES.get("gameStarted")))
				&& (!(((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard())
								.getPlayerTeam(((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event
										.getPlayer())))) == null)))) {
			if (!PluginMain.checkEquals(String.valueOf(
					((java.lang.Object) (Object) ((char) ((java.lang.String) ((java.lang.String) event.getMessage())
							.trim()).charAt(((int) (0d)))))),
					"!")) {
				event.setCancelled(true);
				$ec22296c4355b48e40198f30b352ff73 = ((org.bukkit.scoreboard.Team) ((org.bukkit.scoreboard.Scoreboard) ((org.bukkit.scoreboard.ScoreboardManager) org.bukkit.Bukkit
						.getScoreboardManager()).getMainScoreboard()).getPlayerTeam(
								((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event.getPlayer()))));
				for (Object FINAL_loopValue1 : PluginMain.createList(
						((org.bukkit.scoreboard.Team) (Object) $ec22296c4355b48e40198f30b352ff73).getPlayers())) {
					if (((boolean) ((org.bukkit.OfflinePlayer) (Object) FINAL_loopValue1).isOnline())) {
						((org.bukkit.command.CommandSender) (Object) FINAL_loopValue1).sendMessage((((((ChatColor
								.translateAlternateColorCodes('&', "&7[&b")
								+ ((java.lang.String) ((org.bukkit.scoreboard.Team) (Object) $ec22296c4355b48e40198f30b352ff73)
										.getName()))
								+ ChatColor.translateAlternateColorCodes('&', "&b's Chat&7] &f<"))
								+ ((java.lang.String) ((org.bukkit.command.CommandSender) (Object) ((org.bukkit.entity.Player) event
										.getPlayer())).getName()))
								+ ChatColor.translateAlternateColorCodes('&', "&f> "))
								+ ((java.lang.String) ((java.lang.String) event.getMessage()).trim())));
					}
				}
			} else {
				event.setMessage(((java.lang.String) ((java.lang.String) ((java.lang.String) event.getMessage()).trim())
						.substring(((int) (1d)))));
			}
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event18(org.bukkit.event.entity.EntityDamageByBlockEvent event) throws Exception {
		if (((PluginMain.checkEquals(((org.bukkit.event.entity.EntityDamageEvent.DamageCause) event.getCause()),
				((org.bukkit.event.entity.EntityDamageEvent.DamageCause) org.bukkit.event.entity.EntityDamageEvent.DamageCause.BLOCK_EXPLOSION))
				&& (!(((org.bukkit.entity.EntityType) ((org.bukkit.entity.Entity) event.getEntity())
						.getType()) == null)))
				&& PluginMain.checkEquals(
						((org.bukkit.entity.EntityType) ((org.bukkit.entity.Entity) event.getEntity()).getType()),
						((org.bukkit.entity.EntityType) org.bukkit.entity.EntityType.PLAYER)))) {
			if (PluginMain.checkEquals(PluginMain.PERSISTENT_VARIABLES.get("settingBed"), "disabled")) {
				event.setDamage((1d));
				org.bukkit.Bukkit.broadcastMessage("DAMAGE DISABLED");
			} else if (PluginMain.checkEquals(PluginMain.PERSISTENT_VARIABLES.get("settingBed"), "reduced")) {
				event.setDamage((((double) event.getFinalDamage()) / (1.5d)));
				org.bukkit.Bukkit.broadcastMessage("DAMAGE REDUCED");
			}
		}
	}

	public static org.bukkit.inventory.ItemStack getNamedItemWithLore(Material material, String name,
			List<String> lore) {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(material);
		org.bukkit.inventory.meta.ItemMeta itemMeta = item.getItemMeta();
		if (itemMeta != null) {
			itemMeta.setDisplayName(name);
			itemMeta.setLore(lore);
			item.setItemMeta(itemMeta);
		}
		return item;
	}

	public static boolean checkEquals(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return false;
		}
		return o1 instanceof Number && o2 instanceof Number
				? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
				: o1.equals(o2);
	}
}
