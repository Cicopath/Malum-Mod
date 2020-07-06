package com.kittykitcatcat.malum.capabilities;

import net.minecraft.nbt.CompoundNBT;

import java.util.ArrayList;
import java.util.List;

public class CapabilityData
{
    public void copyFrom(CapabilityData source)
    {
    }

    public void saveNBTData(CompoundNBT compound)
    {
        compound.putBoolean("husk", husk);
    }
    public void loadNBTData(CompoundNBT compound)
    {
        husk = compound.getBoolean("husk");
    }

    public float spiritIntegrityMultiplier;
    public float getSpiritIntegrityMultiplier()
    {
        return spiritIntegrityMultiplier;
    }

    public int extraSpirits;
    public int getExtraSpirits()
    {
        return extraSpirits;
    }

    boolean husk;
    public boolean getHusk()
    {
        return husk;
    }
}
