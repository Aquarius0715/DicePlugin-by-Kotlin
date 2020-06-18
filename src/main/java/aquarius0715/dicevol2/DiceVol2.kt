package aquarius0715.dicevol2

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.ConsoleCommandSender
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import java.util.*

class DiceVol2 : JavaPlugin(), Listener {
    override fun onEnable() {
        server.getPluginCommand("dice")
    }

    override fun onDisable() {

    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (label.equals("dice", ignoreCase = true)) {
            if (sender is ConsoleCommandSender) {
                sender.sendMessage("You cannot this")
                return true
            }

            val random = Random()
            val rnd = random.nextInt(6) + 1
            sender.sendMessage("6面サイコロを振って" + rnd + "が出ました！")
            return true
        }
        return super.onCommand(sender, command, label, args)
    }
}