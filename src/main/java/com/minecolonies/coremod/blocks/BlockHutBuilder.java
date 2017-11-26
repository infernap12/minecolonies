package com.minecolonies.coremod.blocks;

import org.jetbrains.annotations.NotNull;

/**
 * Hut for the builder.
 * No different from {@link AbstractBlockHut}
 */
public class BlockHutBuilder extends AbstractBlockHut<BlockHutBuilder>
{
    protected BlockHutBuilder()
    {
        //No different from Abstract parent
        super();
    }

    @NotNull
    @Override
    public String getName()
    {
        return "blockhutbuilder";
    }
}
