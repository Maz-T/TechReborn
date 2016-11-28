package techreborn.blocks.generator;

import me.modmuss50.jsonDestroyer.api.ITexturedBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import reborncore.RebornCore;
import reborncore.common.BaseTileBlock;
import techreborn.client.TechRebornCreativeTab;
import techreborn.tiles.generator.TileWindMill;

/**
 * Created by modmuss50 on 25/02/2016.
 */
public class BlockWindMill extends BaseTileBlock {

	private final String prefix = "techreborn:blocks/machine/generators/";

	public BlockWindMill() {
		super(Material.IRON);
		setUnlocalizedName("techreborn.windmill");
		setCreativeTab(TechRebornCreativeTab.instance);
		setHardness(2.0F);
		RebornCore.jsonDestroyer.registerObject(this);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileWindMill();
	}

}
