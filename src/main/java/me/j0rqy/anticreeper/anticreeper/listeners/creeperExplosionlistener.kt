package me.j0rqy.anticreeper.anticreeper.listeners

import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityExplodeEvent

class CreeperExplosionListener : Listener {

    @EventHandler
    fun onCreeperExplode(event: EntityExplodeEvent) {
        // Check if the exploding entity is a Creeper
        if (event.entityType == EntityType.CREEPER) {
            // Prevent the explosion from causing damage
            event.isCancelled = true
        }
    }
}