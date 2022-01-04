
package net.mcreator.catastropheredo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

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
		return Collections.singletonList(new ItemStack(CatastropheredoModItems.DELETED_MOD_ELEMENT));
	}

}
