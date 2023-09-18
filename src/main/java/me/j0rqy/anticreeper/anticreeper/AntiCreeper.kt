package me.j0rqy.anticreeper.anticreeper

import me.j0rqy.anticreeper.anticreeper.listeners.CreeperExplosionListener
//import me.j0rqy.anticreeper.anticreeper.listeners.onCreeperExplode
import org.bukkit.plugin.java.JavaPlugin

class AntiCreeper : JavaPlugin() {
    override fun onEnable() {
        logger.info("Enabled Anti Creeper!")
        registerListeners()

    }

    private fun registerListeners(){
        server.pluginManager.registerEvents(CreeperExplosionListener(), this)
    }

    override fun onDisable() {
        logger.info("Disabled Anti Creeper!")
    }
}
