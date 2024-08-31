package com.example.gxx;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;

import android.view.View;
import android.widget.ImageView;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    Random rd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.btnOne);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                int rad = rd.nextInt(5) + 1;

                if(rad == 1){
                    imageView.setImageResource(R.drawable.one);
                }
                if(rad == 2){
                    imageView.setImageResource(R.drawable.two);
                }
                if(rad == 3){
                    imageView.setImageResource(R.drawable.three);
                }
                if(rad == 4){
                    imageView.setImageResource(R.drawable.four);
                }
                if(rad == 5){
                    imageView.setImageResource(R.drawable.five);
                }

            }
        });
    }
}