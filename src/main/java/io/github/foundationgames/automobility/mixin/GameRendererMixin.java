package io.github.foundationgames.automobility.mixin;

import io.github.foundationgames.automobility.entity.AutomobileEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
    @Shadow @Final private MinecraftClient client;

    private float tickDelta = 0f;

    @Inject(method = "getFov", at = @At("HEAD"))
    private void automobility$cacheGetFovArgs(Camera camera, float tickDelta, boolean changingFov, CallbackInfoReturnable<Double> cir) {
        this.tickDelta = tickDelta;
    }

    @ModifyVariable(method = "getFov", at = @At(value = "RETURN", ordinal = 1, shift = At.Shift.BEFORE), index = 4)
    private double automobility$applyBoostFovEffect(double old) {
        var player = client.player;
        if (player.getVehicle() instanceof AutomobileEntity auto) {
            return old + ((auto.getBoostSpeed(tickDelta) * 18) * client.options.fovEffectScale);
        }
        return old;
    }
}
