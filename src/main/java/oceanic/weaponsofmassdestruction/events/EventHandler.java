package oceanic.weaponsofmassdestruction.events;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import oceanic.weaponsofmassdestruction.explosions.AntimatterExplosion;

import java.util.ArrayList;
@Mod.EventBusSubscriber
public class EventHandler {
    @SubscribeEvent
    public static void onTick(TickEvent.LevelTickEvent e) {
    }
}
