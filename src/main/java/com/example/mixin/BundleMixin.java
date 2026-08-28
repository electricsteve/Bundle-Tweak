package com.example.mixin;

import com.mojang.serialization.DataResult;

//? if >=26.1 {
import net.minecraft.world.item.ItemInstance;
//? } else
//import net.minecraft.world.item.ItemStack;

import org.spongepowered.asm.mixin.Mixin;

//? if >=1.20.5 {
import net.minecraft.world.item.component.BundleContents;
//? } else
//import net.minecraft.world.item.BundleItem;

import org.apache.commons.lang3.math.Fraction;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//? if >=1.20.5 {
@Mixin(BundleContents.class)
//? } else
//@Mixin(BundleItem.class)
public class BundleMixin {
	@Inject(method = "getWeight", at = @At("TAIL"), cancellable = true)
	private static void modifyWeight(
			//? if >=26.1 {
			ItemInstance item,
			//? } else
			//ItemStack item,
			//? if >=26.1 {
			CallbackInfoReturnable<DataResult<Fraction>> cir) {
			//? } else if >=1.20.5 {
			//CallbackInfoReturnable<Fraction> cir) {
			//? } else
			//CallbackInfoReturnable<Integer> cir) {
		//? if >=26.1 {
		cir.setReturnValue(DataResult.success(Fraction.getFraction(1, 64)));
		//? } else if >=1.20.5 {
		//cir.setReturnValue(Fraction.getFraction(1, 64));
		//? } else
		//cir.setReturnValue(1);
	}
}