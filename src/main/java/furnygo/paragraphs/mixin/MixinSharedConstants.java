package furnygo.paragraphs.mixin;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SharedConstants.class)
public class MixinSharedConstants {

    /**
     * Allows section signs (§) and formatted styling in chat, books, and inputs.
     */
    @Inject(method = "isValidChar", at = @At("HEAD"), cancellable = true)
    private static void isValidChar(char chr, CallbackInfoReturnable<Boolean> cir) {
        if (chr == '§' || chr == 167) {
            cir.setReturnValue(true);
        }
    }
}
