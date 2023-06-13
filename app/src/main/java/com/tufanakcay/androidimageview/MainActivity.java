package com.tufanakcay.androidimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initiation();
        click();

    }

    private void initiation() {

        imageView = findViewById(R.id.image_view);
        button = findViewById(R.id.change_button);

    }

    private void click() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = (int) (Math.random() * 5 + 1);

                imageChange(rnd);

                Toast.makeText(MainActivity.this, "Image number " + rnd, Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void imageChange(int num) {


        if (num == 1) {

            imageView.setImageResource(R.drawable.one);
        } else if (num == 2) {
            imageView.setImageResource(R.drawable.two);
        } else if (num == 3) {
            imageView.setImageResource(R.drawable.three);
        } else if (num == 4) {
            imageView.setImageResource(R.drawable.four);
        } else {
            imageView.setImageResource(R.drawable.five);
        }

    }
}