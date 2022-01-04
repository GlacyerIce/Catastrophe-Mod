
package net.mcreator.catastropheredo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SilverOreBlock extends Block {

	public SilverOreBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.STONE).strength(1f, 10f).requiresCorrectToolForDrops());

		setRegistryName("silver_ore");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

}
