package com.example.adapter1;

public class AdapterApp {

    public static void main(String[] args) {
    VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
    VectorGraphicsInterface g2 = new VectorAdapterFromRaster();
//    g1.drawLine();
//    g1.drawSquare();
    g2.drawLine();
    g2.drawSquare();
    }
}
