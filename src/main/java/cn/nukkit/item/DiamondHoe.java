package cn.nukkit.item;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class DiamondHoe extends Tool {

    public DiamondHoe() {
        this(0, 1);
    }

    public DiamondHoe(int meta) {
        this(meta, 1);
    }

    public DiamondHoe(int meta, int count) {
        super(DIAMOND_HOE, meta, count, "Diamond Axe");
    }

    @Override
    public int getMaxDurability() {
        return Tool.DURABILITY_DIAMOND;
    }

    @Override
    public boolean isHoe() {
        return true;
    }
}