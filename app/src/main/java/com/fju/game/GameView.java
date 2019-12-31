package com.fju.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View { //類別繼承VIEW
    private float posX, posY = 200; //現在位置


    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    } //54gl3ul4u.3xu;3ke7h0 gj4k27ru04e.4至少要有兩件鹼購子

    @Override //複寫
    protected void onDraw(Canvas canvas) { //畫圖
        super.onDraw(canvas);
        Log.d("Game", "onDraw: " + getWidth() + "," + getHeight());
        Paint paint = new Paint();
        Paint paint0 = new Paint();
        paint0.setColor(0);
        canvas.drawLine(400,0, 0,600, paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.monkey);
        canvas.drawBitmap(bitmap, posX, posY, paint);
//        for (int i=0; i<getHeight()-bitmap.getHeight(); i+=50) {
//            canvas.drawBitmap(bitmap, 400, 300+i, paint);
//        }
    }

    public void moveRight(){
        if(posX<getWidth()-100){
            this.posX+=50;
            Log.d("GameView","posX="+posX);
        }
    }

    public void moveLeft(){
        if(posX>50){
            this.posX-=50;
            Log.d("GameView","posX="+posX);
        }
    }

    public void moveUp(){
        if(posY>=0){
            this.posY-=50;
            Log.d("GameView","posY="+posY);
        }
    }
    public void moveDown(){
        if(posY>=0){
            this.posY+=50;
            Log.d("GameView","posY="+posY);
        }
    }



    public float getPosX() {
        return posX;
    } //位方漸變起見 我紹了

    public void setPosX(float posX) {
        if (posX >= 0 && posX < getWidth()-100) {
            this.posX = posX;
            Log.d("GameView","posX="+posX);
        }
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    } //通道設計ｙ
}
