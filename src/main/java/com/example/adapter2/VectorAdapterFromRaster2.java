package com.example.adapter2;

import com.example.adapter1.RasterGraphics;
import com.example.adapter1.VectorGraphicsInterface;

public class VectorAdapterFromRaster2 implements VectorGraphicsInterface {
    RasterGraphics rasterGraphics = null ;//new RasterGraphics();

    public VectorAdapterFromRaster2(RasterGraphics raster){
        this.rasterGraphics = raster;
    }

    public void drawLine() {
    rasterGraphics.drawRasterLine();
    }

    public void drawSquare() {
    rasterGraphics.drawRasterSquare();
    }
}
