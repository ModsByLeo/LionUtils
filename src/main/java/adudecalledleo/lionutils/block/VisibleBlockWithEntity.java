package adudecalledleo.lionutils.block;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;

/**
 * <p>{@link net.minecraft.block.Block Block} that provides a {@link net.minecraft.block.entity.BlockEntity BlockEntity}.</p>
 * Unlike {@link BlockWithEntity}, this block is visible without having to add a
 * {@link net.minecraft.client.render.block.entity.BlockEntityRenderer BlockEntityRenderer} to it.
 */
public abstract class VisibleBlockWithEntity extends BlockWithEntity {
    protected VisibleBlockWithEntity(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}