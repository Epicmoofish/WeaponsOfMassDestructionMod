package oceanic.weaponsofmassdestruction.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import oceanic.weaponsofmassdestruction.explosions.AntimatterExplosion;

public class TestBlock extends Block {
    public TestBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void onPlace(BlockState p_60566_, Level p_60567_, BlockPos p_60568_, BlockState p_60569_, boolean p_60570_) {
        new AntimatterExplosion(p_60567_, null, null, null, p_60568_.getX(), p_60568_.getY(), p_60568_.getZ(), 0, false, null).explode();
        super.onPlace(p_60566_, p_60567_, p_60568_, p_60569_, p_60570_);
    }
}
