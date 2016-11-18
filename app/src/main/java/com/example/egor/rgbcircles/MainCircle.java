package com.example.egor.rgbcircles;

/**
 * Created by egor on 10/19/16.
 */

public class MainCircle {
    public static final int INT_RADIUS = 50;
    private int x;

    public MainCircle(int x, int y) {
        this.x = x;
        this.y = y;
        radius = INT_RADIUS;
    }

    private int y;
    private int radius;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

}
