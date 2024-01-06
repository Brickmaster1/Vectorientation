package vectorientation.forge;

import dev.architectury.platform.forge.EventBuses;
import vectorientation.Vectorientation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Vectorientation.MOD_ID)
public class VectorientationForge {
    public VectorientationForge() {
        EventBuses.registerModEventBus(Vectorientation.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Vectorientation.init();
    }
}
