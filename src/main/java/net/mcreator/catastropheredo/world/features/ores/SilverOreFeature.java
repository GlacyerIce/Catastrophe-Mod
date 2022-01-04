
package net.mcreator.catastropheredo.world.features.ores;

public class SilverOreFeature extends OreFeature {

	public static final SilverOreFeature FEATURE = (SilverOreFeature) new SilverOreFeature().setRegistryName("catastropheredo:silver_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(SilverOreFeatureRuleTest.INSTANCE, CatastropheredoModBlocks.SILVER_ORE.defaultBlockState(), 4))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(20), VerticalAnchor.absolute(30)))).squared().count(1);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public SilverOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class SilverOreFeatureRuleTest extends RuleTest {

		static final SilverOreFeatureRuleTest INSTANCE = new SilverOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<SilverOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<SilverOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("catastropheredo:silver_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
