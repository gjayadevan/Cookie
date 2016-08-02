package com.example.android.cookie;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){

        //setContentView(R.layout.activity_after_eating);
        ImageView img = (ImageView)findViewById(R.id.android_cookie_image_view);
        img.setImageResource(R.drawable.after_cookie);

        TextView tv = (TextView)findViewById(R.id.status_text_view);
        tv.setText("I am so full");
        Log.i("onClick()","Set it to 'I am so full'");

    }
}
