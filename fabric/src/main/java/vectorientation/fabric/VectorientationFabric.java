package vectorientation.fabric;

import vectorientation.Vectorientation;
import net.fabricmc.api.ModInitializer;

public class VectorientationFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Vectorientation.init();
    }
}
