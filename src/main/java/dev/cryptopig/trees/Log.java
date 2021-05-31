package dev.cryptopig.trees;

import static net.minecraft.util.ActionResultType.PASS;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

/**
 * @author CryptoPig
 */

public class Log extends HorizontalBlock {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public Log(Block.Properties props) {
        super(props);
        this.setDefaultState(this.getDefaultState().with(HORIZONTAL_FACING, Direction.NORTH));
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
            Hand handIn, BlockRayTraceResult hit) {
        return PASS;
    }

}
