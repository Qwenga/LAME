package com.example.rasmusengmark.lame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = (Button) findViewById(R.id.btn1);//Show
        final Button btn2 = (Button) findViewById(R.id.btn2);//Hide
        final Button btn3 = (Button) findViewById(R.id.btn3);//Remove
        final Button btn4 = (Button) findViewById(R.id.btn4);//Increase margin
        final Button btn5 = (Button) findViewById(R.id.btn5);//Decrease margin
        final ImageView einstein = (ImageView) findViewById(R.id.imageView);
        final RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) einstein.getLayoutParams();


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    einstein.setVisibility(View.VISIBLE);
                }
                catch(IndexOutOfBoundsException e) {
                }
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    einstein.setVisibility(View.INVISIBLE);
                }
                catch (IndexOutOfBoundsException e){

                }
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            
                einstein.setImageBitmap(null);
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int a = einstein.getLayoutParams().height;
                einstein.getLayoutParams().height = a+20;
                einstein.requestLayout();
            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int a = einstein.getLayoutParams().height;
                einstein.getLayoutParams().height = a-20;
                einstein.requestLayout();

            }

        });
    }
}
