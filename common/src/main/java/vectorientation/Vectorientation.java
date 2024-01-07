package vectorientation;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class Vectorientation {

	public static final String MOD_ID = "vectorientation";

	public static boolean squetch = false;

	@Environment(EnvType.CLIENT)
	public static void init() {
		ConfigBuilder builder = ConfigBuilder.create()
				.setParentScreen(MinecraftClient.getInstance().currentScreen)
				.setTitle(Text.of("Vectorientation Config"));

		AutoConfig.register(Config.class, JanksonConfigSerializer::new);

		squetch = AutoConfig.getConfigHolder(Config.class).getConfig().toggleSquishing;
	}
}
