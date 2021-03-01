package com.snajdovski.anglespeedrun;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//Created by snajdovski 01/03/2021 for learning purposes (trigonometry)

public class MainActivity extends AppCompatActivity  {

    /*Buttons*/
    private Button mButtonAcute;
    private Button mButtonObtuse;
    private Button mButtonRight;
    private Button mButtonStraight;
    private Button mButtonOblique;

    /*ImageView*/
    private ImageView mImageView;

    /*TextView*/
    private TextView mAngleNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        startGame();
    }

    private void initViews()    {
        mButtonAcute=findViewById(R.id.tv_btn_acute);
        mButtonObtuse=findViewById(R.id.tv_btn_obtuse);
        mButtonRight=findViewById(R.id.tv_btn_right);
        mButtonStraight=findViewById(R.id.tv_btn_straight);
        mButtonOblique=findViewById(R.id.tb_btn_oblique);

        mImageView=findViewById(R.id.tv_image_angle);
        mAngleNameText=findViewById(R.id.name_of_the_current_angle);

    }

    private void startGame()    {
        mButtonAcute.setOnClickListener(v -> {
            mImageView.setImageResource(R.drawable.acute_angle);
            mAngleNameText.setText(R.string.acute);
        });
        mButtonObtuse.setOnClickListener(v -> {
            mImageView.setImageResource(R.drawable.obtuse_angle);
            mAngleNameText.setText(R.string.obtuse);
        });
        mButtonRight.setOnClickListener(v -> {
            mImageView.setImageResource(R.drawable.right_angle);
            mAngleNameText.setText(R.string.right);
        } );
        mButtonStraight.setOnClickListener(v -> {
            mImageView.setImageResource(R.drawable.straight_line);
            mAngleNameText.setText(R.string.straight);
        });
        mButtonOblique.setOnClickListener(v -> {
            mImageView.setImageResource(R.drawable.oblique_angle);
            mAngleNameText.setText(R.string.oblique);
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        //do nothing not even back
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}