package net.thefluffycart.depthsmod;

import net.fabricmc.api.ModInitializer;
import net.thefluffycart.depthsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SunkenDepthsMod implements ModInitializer {
	public static final String MOD_ID = "depthsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
