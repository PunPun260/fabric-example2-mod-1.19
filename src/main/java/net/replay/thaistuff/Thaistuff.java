package net.replay.thaistuff;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class Thaistuff implements ModInitializer {
	public static final String ModID = "Thai_stuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
