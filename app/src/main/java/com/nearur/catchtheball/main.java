package com.nearur.catchtheball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class main extends AppCompatActivity {

    public TextView scorelabel;
    public TextView startlabel;
    public ImageView box;
    public ImageView pink;
    public ImageView black;
    public  ImageView orange;

    //position
    private int boxY;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        scorelabel=(TextView)findViewById(R.id.scorelabel);
        startlabel=(TextView)findViewById(R.id.tap_to_start);
        box=(ImageView)findViewById(R.id.box);
        pink=(ImageView)findViewById(R.id.pink);
        black=(ImageView)findViewById(R.id.black);
        orange=(ImageView)findViewById(R.id.orange);


        //move to out of screen
        orange.setX(0b11111111111111111111111110110000);
        orange.setY(0b11111111111111111111111110110000);
        pink.setX(0b11111111111111111111111110110000);
        pink.setY(0b11111111111111111111111110110000);
        black.setX(0b11111111111111111111111110110000);
        black.setY(0b11111111111111111111111110110000);


        // temporary
        startlabel.setVisibility(View.INVISIBLE);
        boxY=500;
    }

    public boolean OnTouchEvent(MotionEvent motionEvent){
        if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){

            boxY -=20;
        }
        box.setY(boxY);

        return true;


    }
}
