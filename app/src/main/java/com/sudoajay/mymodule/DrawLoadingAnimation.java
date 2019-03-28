package com.sudoajay.mymodule;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

public class DrawLoadingAnimation extends View {


    private Bitmap mBitmap;
    private Canvas mCanvas;
    private Path mPath;
    private Context mContext;
    private Paint mPaint;
    private int x = 0, y = 0;

    public DrawLoadingAnimation(final Context mContext, final AttributeSet attrs) {
        super(mContext, attrs);
        this.mContext = mContext;

        // Create Object

        // we set a new Path
        mPath = new Path();

        // and we set a new Paint with the desired attributes
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);

//        call_Thread();
    }


    // override onSizeChanged
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        // your Canvas will draw onto the defined Bitmap
        mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mBitmap);

    }

    // override onDraw
    @Override
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        int alpha = 700, rad = 22, radius = 80, alp=25 , gap = 18;
        // draw the mPath with the mPaint on the canvas when onDraw
        canvas.drawPath(mPath, mPaint);
//        canvas.drawCircle((float) getWidth() / 2, (float) getHeight() / 2, radius, mPaint);


//        mPaint.setTextSize(25);
//        for (int i = 0 ; i<100;i+=6) {
//        canvas.drawText(i+"",(float) getWidth() / 2 + radius * (float) Math.cos(i),
//                (float) getHeight() / 2 + radius * (float) Math.sin(i), mPaint);
//        }

        mPaint.setAlpha(alpha);
        canvas.drawCircle((float) getWidth() / 2 + radius * (float) Math.cos(x),
                (float) getHeight() / 2 + radius * (float) Math.sin(x), rad, mPaint);
        alpha -= alp;
        rad -= 2;
        x += gap;
        mPaint.setAlpha(alpha);
        canvas.drawCircle((float) getWidth() / 2 + radius * (float) Math.cos((x)),
                (float) getHeight() / 2 + radius * (float) Math.sin((x)), rad, mPaint);
        rad -= 2;
        x += gap;
        alpha -= alp;
        mPaint.setAlpha(alpha);
        canvas.drawCircle((float) getWidth() / 2 + radius * (float) Math.cos(x),
                (float) getHeight() / 2 + radius * (float) Math.sin(x), rad, mPaint);
        alpha -= alp;
        rad -= 2;
        x += gap;
        mPaint.setAlpha(alpha);
        canvas.drawCircle((float) getWidth() / 2 + radius * (float) Math.cos((x)),
                (float) getHeight() / 2 + radius * (float) Math.sin((x)), rad, mPaint);
        rad -= 2;
        x += gap;
        alpha -= alp;
        mPaint.setAlpha(alpha);
        canvas.drawCircle((float) getWidth() / 2 + radius * (float) Math.cos(x),
                (float) getHeight() / 2 + radius * (float) Math.sin(x), rad, mPaint);
        alpha -= alp;
        rad -= 3;
        x += gap;
        mPaint.setAlpha(alpha);
        canvas.drawCircle((float) getWidth() / 2 + radius * (float) Math.cos((x)),
                (float) getHeight() / 2 + radius * (float) Math.sin((x)), rad, mPaint);
        rad -= 2;
        x += gap;
        alpha -= alp;
        mPaint.setAlpha(alpha);
        canvas.drawCircle((float) getWidth() / 2 + radius * (float) Math.cos((x)),
                (float) getHeight() / 2 + radius * (float) Math.sin((x)), rad, mPaint);


        this.postInvalidateDelayed(150);

    }

    public void call_Thread() {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                try {

                    x++;
                    y++;
                    invalidate();
                    call_Thread();


                } catch (Exception ignored) {

                }


            }
        }, 300);

    }

    // clear The Whole Path
    public void clearCanvas() {
        mPath.reset();
        invalidate();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mWidth = MeasureSpec.getSize(widthMeasureSpec);
        int mHeight = MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(mWidth, mHeight);
    }

}