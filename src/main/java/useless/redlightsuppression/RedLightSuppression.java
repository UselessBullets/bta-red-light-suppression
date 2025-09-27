package useless.redlightsuppression;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RedLightSuppression implements ModInitializer {
    public static final String MOD_ID = "redlightsuppression";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("RedLightSuppression initialized.");
    }
}
