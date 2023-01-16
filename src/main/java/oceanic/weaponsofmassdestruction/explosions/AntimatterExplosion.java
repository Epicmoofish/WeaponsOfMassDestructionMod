package oceanic.weaponsofmassdestruction.explosions;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import oceanic.weaponsofmassdestruction.events.EventHandler;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AntimatterExplosion extends Explosion {
    private int iter = 200;
    public boolean remove = false;
    public AntimatterExplosion(Level p_46024_, @Nullable Entity p_46025_, double p_46026_, double p_46027_, double p_46028_, float p_46029_, List<BlockPos> p_46030_) {
        super(p_46024_, p_46025_, p_46026_, p_46027_, p_46028_, p_46029_, p_46030_);
    }

    public AntimatterExplosion(Level p_46041_, @Nullable Entity p_46042_, double p_46043_, double p_46044_, double p_46045_, float p_46046_, boolean p_46047_, BlockInteraction p_46048_, List<BlockPos> p_46049_) {
        super(p_46041_, p_46042_, p_46043_, p_46044_, p_46045_, p_46046_, p_46047_, p_46048_, p_46049_);
    }

    public AntimatterExplosion(Level p_46032_, @Nullable Entity p_46033_, double p_46034_, double p_46035_, double p_46036_, float p_46037_, boolean p_46038_, BlockInteraction p_46039_) {
        super(p_46032_, p_46033_, p_46034_, p_46035_, p_46036_, p_46037_, p_46038_, p_46039_);
    }

    public AntimatterExplosion(Level p_46051_, @Nullable Entity p_46052_, @Nullable DamageSource p_46053_, @Nullable ExplosionDamageCalculator p_46054_, double p_46055_, double p_46056_, double p_46057_, float p_46058_, boolean p_46059_, BlockInteraction p_46060_) {
        super(p_46051_, p_46052_, p_46053_, p_46054_, p_46055_, p_46056_, p_46057_, p_46058_, p_46059_, p_46060_);
    }

    @Override
    public void explode() {
        for (int x = -iter; x<=iter; x++) {
            for (int y = -iter; y<=iter; y++) {
                for (int z = -iter; z<=iter; z++) {
                    int distsq = x*x+y*y+z*z;
                    if (distsq <= iter*iter) {
                        if (this.level.getBlockState(new BlockPos(this.getPosition().add(x,y,z))).getBlock().defaultDestroyTime() > 0) {
                            this.level.setBlockAndUpdate(new BlockPos(this.getPosition().add(x, y, z)), Blocks.AIR.defaultBlockState());
                        }
                    }
                }
            }
        }
    }
}
