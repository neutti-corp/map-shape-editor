package com.neutti.vo;

import lombok.Data;

@Data
public class TileVO {
    String matrixId;
    String matrixId2;
    int x, y;
    double minX, minY, maxX, maxY;
    public TileVO(String matrixId, String matrixId2, int x, int y, double minX, double minY, double maxX, double maxY) {
        this.matrixId = matrixId;
        this.matrixId2 = matrixId2;
        this.x = x;
        this.y = y;
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    @Override
    public String toString() {
        return String.format("MatrixID: %s, X: %d, Y: %d, Bounds: [%.2f, %.2f, %.2f, %.2f]", matrixId, x, y, minX, minY, maxX, maxY);
    }
}
