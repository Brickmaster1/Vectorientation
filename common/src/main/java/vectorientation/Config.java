package vectorientation;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@me.shedaniel.autoconfig.annotation.Config(name = "vectorientation")
public class Config implements ConfigData {
    boolean toggleSquishing = false;
}
