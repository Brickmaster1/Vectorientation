package vectorientation;

import net.fabricmc.api.ModInitializer;
import vectorientation.simpleLibs.simpleConfig.SimpleConfig;

public class Vectorientation {

	public static final String MOD_ID = "vectorientation";

	public static boolean squetch;

	public static void init() {
		SimpleConfig CONFIG = SimpleConfig.of( "vectorientation" ).provider( Vectorientation::provider ).request();
		squetch = CONFIG.getOrDefault("squetch", true);
		System.out.println("[Tec] Ready to rotate some falling blocks! Squishy blocks enabled: " + squetch);
	}
	
	private static String provider(String filename) {
		return "#Enable Squash & Stretch:\n"
				+ "squetch=true";
    }
}
