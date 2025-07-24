package us.ajg0702.leaderboards.loaders;

import us.ajg0702.leaderboards.LeaderboardPlugin;
import us.ajg0702.utils.common.Messages;

import java.util.Arrays;

public class MessageLoader {
    public static Messages loadMessages(LeaderboardPlugin plugin) {
        return new Messages(plugin.getDataFolder(), plugin.getLogger(), Messages.makeDefaults(
                "signs.top.default", Arrays.asList(
                            "&7&m       &r #{POSITION} &7&m       ",
                            "&6{NAME}",
                            "&e{VALUE} {VALUENAME}",
                            "&7&m                   "
                ),

                "no-player-skin.default", "Superman00800",

                "formatted.k", "k",
                "formatted.m", "m",
                "formatted.t", "t",
                "formatted.b", "b",
                "formatted.q", "q",
                "formatted.qi", "qi",
                "formatted.sx", "sx",
                "formatted.sp", "sp",
                "formatted.o", "o",
                "formatted.n", "n",
                "formatted.d", "d",
                "formatted.ud", "ud",

                "time.format", "HH'h:'mm'm:'ss's'",

                "noperm", "You don't have permission to do this!",

                "commands.reload.success", "&aConfigs reloaded!",
                "commands.reload.fail", "&cAn error occurred while reloading one of your configs. Check the console for more info.",

                "commands.export.fileexists", "&cThe file &f{FILE}&c already exists!",
                "commands.export.starting", "&7Fetching all players from the database. This might take a bit.",
                "commands.export.fail", "&cAn error occurred while exporting. Check the console for more info.",
                "commands.export.progress", "&eProgress: &f{DONE}&7/&f{TOTAL}&7 boards fetched",
                "commands.export.success", "&aThe cache has been exported to the file &f{FILE}&a!",

                "commands.viewer.success", "\n&aThe cache has been uploaded and is viewable at&f " +
                        "<hover:show_text:'<yellow>Click to go to&f {URL}'>" +
                        "<click:open_url:'{URL}'>" +
                        "<white><underlined>{URL}" +
                        "</click>" +
                        "</hover>\n",
                "commands.viewer.uploading", "&7Uploading..",

                "commands.import.nofile", "&cThe file &f{FILE}&c doesnt exist!",
                "commands.import.starting", "&7Loading all cached stats from &f{FILE}",
                "commands.import.fail", "&cAn error occurred while importing. Check the console for more info.",
                "commands.import.insertprogress", "&eProgress: &f{DONE}&7/&f{TOTAL}&7 boards imported",
                "commands.import.success", "&aThe cache has been imported from the file &f{FILE}&a!",

                "no-data.lb.name", plugin.getAConfig().hasEntry("no-data-name") ?
                        plugin.getAConfig().getString("no-data-name") :
                        "---",
                "no-data.lb.value", plugin.getAConfig().hasEntry("no-data-score") ?
                        plugin.getAConfig().getString("no-data-score") :
                        "---",
                "no-data.extra", plugin.getAConfig().hasEntry("no-data-name") ?
                        plugin.getAConfig().getString("no-data-name") :
                        "---",
                "no-data.rel.position", "{POSITION}",
                "no-data.rel.name", "---",
                "no-data.rel.value", "---",

                "loading.text", "Loading",
                "loading.short", "-?-",
                "loading.position", "..",
                "loading.size", "...",

                "updater.slow-feedback", "&7Checking for update and downloading...",
                "updater.disabled", "&cThe updater is disabled! &7Please enable it in the config to download updates.",
                "updater.success", "&aUpdate downloaded! &7Restart the server to apply the update.",
                "updater.warnings.could-not-delete-old-jar", "&aUpdate downloaded&e but the old jar could not be deleted. &7Please delete the old jar before restarting the server.",
                "updater.errors.no-update-available", "&aYou are already up to date!",
                "updater.errors.while-checking", "&eAn error occurred while checking for an update. &7See the console for more info.",
                "updater.errors.already-downloaded", "&aYou have already downloaded an update! &7Restart the server to apply it.",
                "updater.errors.while-downloading", "&eAn error occurred while downloading an update. &7See the console for more info.",
                "updater.errors.unknown", "&eAn unknown error occurred: {ERROR}",
                "updater.errors.uncaught", "&cAn error occurred while executing this command. &7See the console."

                ));
    }
}
