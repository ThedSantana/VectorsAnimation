package com.baoyachi.vectorsanimation;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.image);
    }

    public void click(View view)
    {
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) ContextCompat.getDrawable(getApplicationContext(),R.drawable.v_mac_anim);
        image.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();

    }
}
