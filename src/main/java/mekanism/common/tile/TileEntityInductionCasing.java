package mekanism.common.tile;

import mekanism.common.Mekanism;
import mekanism.common.content.matrix.MatrixUpdateProtocol;
import mekanism.common.content.matrix.SynchronizedMatrixData;
import mekanism.common.multiblock.MultiblockManager;

public class TileEntityInductionCasing extends TileEntityMultiblock<SynchronizedMatrixData>
{
	public TileEntityInductionCasing() 
	{
		this("InductionCasing");
	}
	
	public TileEntityInductionCasing(String name)
	{
		super(name);
	}

	@Override
	protected SynchronizedMatrixData getNewStructure() 
	{
		return new SynchronizedMatrixData();
	}

	@Override
	protected MatrixUpdateProtocol getProtocol() 
	{
		return new MatrixUpdateProtocol(this);
	}

	@Override
	public MultiblockManager<SynchronizedMatrixData> getManager() 
	{
		return Mekanism.matrixManager;
	}
}