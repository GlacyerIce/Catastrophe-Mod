
package net.mcreator.catastropheredo.block;

import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.catastropheredo.init.CatastropheredoModBlocks;

import java.util.List;
import java.util.Collections;

public class AbyssrockBlock extends Block {
	public AbyssrockBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.deepslate.break")),
						() -> new SoundEvent(new ResourceLocation("block.deepslate.step")),
						() -> new SoundEvent(new ResourceLocation("block.deepslate.place")),
						() -> new SoundEvent(new ResourceLocation("block.deepslate.hit")),
						() -> new SoundEvent(new ResourceLocation("block.deepslate.fall"))))
				.strength(1f, 10f).requiresCorrectToolForDrops());
		setRegistryName("abyssrock");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(CatastropheredoModBlocks.ABYSS_COBBLE));
	}
}
