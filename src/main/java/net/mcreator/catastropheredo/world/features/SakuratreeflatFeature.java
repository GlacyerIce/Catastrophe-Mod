
package net.mcreator.catastropheredo.world.features;

public class SakuratreeflatFeature extends Feature<NoneFeatureConfiguration> {

	public static final SakuratreeflatFeature FEATURE = (SakuratreeflatFeature) new SakuratreeflatFeature()
			.setRegistryName("catastropheredo:sakuratreeflat");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE.configured(FeatureConfiguration.NONE);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("catastropheredo:sakura_plains"),
			new ResourceLocation("catastropheredo:sakura_mountains"), new ResourceLocation("catastropheredo:sakura_forest"));

	private StructureTemplate template = null;

	public SakuratreeflatFeature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		boolean dimensionCriteria = false;
		ResourceKey<Level> dimensionType = context.level().getLevel().dimension();
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("catastropheredo", "sakura_tree_flat"));

		if (template == null)
			return false;

		if ((context.random().nextInt(1000000) + 1) <= 0) {
			boolean anyPlaced = false;
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);

				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k);
				j -= 1;

				BlockPos spawnTo = new BlockPos(i + -4, j + 0, k + -4);

				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)])
								.setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
								.addProcessor(BlockIgnoreProcessor.AIR).setIgnoreEntities(false),
						context.random(), 2)) {

					anyPlaced = true;
				}
			}

			return anyPlaced;
		}

		return false;
	}

}
