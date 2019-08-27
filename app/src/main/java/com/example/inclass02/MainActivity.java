package com.example.inclass02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_shape;
    private TextView txt_result;
    private Button button_calculate;
    private Button button_clear;
    private ImageView img_triangle;
    private ImageView img_square;
    private ImageView img_circle;
    private EditText et_length1;
    private EditText et_length2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Area Calculator");

        txt_shape = (TextView) findViewById(R.id.txt_shape);
        txt_result = (TextView) findViewById(R.id.txt_result);
        button_calculate = (Button) findViewById(R.id.btn_calculate);
        button_clear =(Button) findViewById(R.id.btn_clear);
        img_square = (ImageView) findViewById(R.id.img_square);
        img_triangle = (ImageView) findViewById(R.id.img_triangle);
        img_circle = (ImageView) findViewById(R.id.img_circle);

    }
}
