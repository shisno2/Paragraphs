package furnygo.paragraphs;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Paragraphs implements ModInitializer {
    public static final String MOD_ID = "paragraphs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Paragraphs initialized: section sign (§) input enabled.");
    }
}
