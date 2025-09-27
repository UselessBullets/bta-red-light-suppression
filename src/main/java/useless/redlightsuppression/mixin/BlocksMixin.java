package useless.redlightsuppression.mixin;

import net.minecraft.core.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Blocks.class, remap = false)
public class BlocksMixin {
	@Inject(method = "<clinit>", at = @At("TAIL"))
	private static void removeLightSources(CallbackInfo ci) {
		Blocks.TORCH_REDSTONE_ACTIVE.withLightEmission(0);
		Blocks.REPEATER_ACTIVE.withLightEmission(0);
	}
}
