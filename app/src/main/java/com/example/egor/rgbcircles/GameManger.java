package com.example.egor.rgbcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by egor on 10/19/16.
 */

public class GameManger {
    private CanvasView canvasView;
    private MainCircle mainCircle;
    private Paint paint;
    private static int width;
    private static int height;

    public GameManger(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainCircle();
        initPaint();

    }

    private void initPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width / 2, height / 2);
    }

    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(), mainCircle.getRadius(), paint);
    }

}
