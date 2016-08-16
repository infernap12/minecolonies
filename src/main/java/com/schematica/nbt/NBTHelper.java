package com.schematica.nbt;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class NBTHelper
{
    public static NBTTagCompound writeTileEntityToCompound(final TileEntity tileEntity)
    {
        final NBTTagCompound tileEntityCompound = new NBTTagCompound();
        tileEntity.writeToNBT(tileEntityCompound);
        return tileEntityCompound;
    }

    public static TileEntity readTileEntityFromCompound(final NBTTagCompound tileEntityCompound)
    {
        return TileEntity.createAndLoadEntity(tileEntityCompound);
    }

    public static NBTTagCompound writeEntityToCompound(final Entity entity)
    {
        final NBTTagCompound entityCompound = new NBTTagCompound();
        if (entity.writeToNBTOptional(entityCompound))
        {
            return entityCompound;
        }

        return null;
    }
}
