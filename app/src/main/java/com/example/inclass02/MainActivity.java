package com.example.inclass02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_shape;
    private TextView tv_result;
    private Button button_calculate;
    private Button button_clear;
    private ImageView iv_triangle;
    private ImageView iv_square;
    private ImageView iv_circle;
    private EditText et_length1;
    private EditText et_length2;
    String shapeSelected;
    double length1;
    double length2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Area Calculator");

        et_length1 = findViewById(R.id.et_length1);
        et_length2 = findViewById(R.id.et_length2);
        tv_result = findViewById(R.id.txt_result);
        tv_shape = findViewById(R.id.txt_shape);
        button_calculate = findViewById(R.id.btn_calculate);
        button_clear = findViewById(R.id.btn_clear);
        iv_triangle = findViewById(R.id.img_triangle);
        iv_square = findViewById(R.id.img_square);
        iv_circle = findViewById(R.id.img_circle);

        length1 = 0.0;
        length2 = 0.0;

        clearButton();

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearButton();
            }
        });

        iv_triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shapeSelected = "triangle";
                tv_shape.setText("Triangle");
                et_length1.setVisibility(View.VISIBLE);
                et_length2.setVisibility(View.VISIBLE);
            }
        });

        iv_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shapeSelected = "square";
                tv_shape.setText("Square");
                et_length1.setVisibility(View.VISIBLE);
                et_length2.setVisibility(View.INVISIBLE);
            }
        });

        iv_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shapeSelected = "circle";
                tv_shape.setText("Circle");
                et_length1.setVisibility(View.VISIBLE);
                et_length2.setVisibility(View.INVISIBLE);
            }
        });




        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempLength1 = et_length1.getText().toString();
                String tempLength2 = et_length2.getText().toString();

                if (tempLength1 != null && !tempLength1.equals("")){
                    length1 = Double.parseDouble(tempLength1);
                }

                if (tempLength2 != null && !tempLength2.equals("")){
                    length2 = Double.parseDouble(tempLength2);
                }

                if(et_length1.getText().toString().equals("")){
                    et_length1.setError("Please Enter a value");
                }
                if(et_length2.getText().toString().equals("")){
                    et_length2.setError("Please Enter a value");
                }

                double area;

                switch (shapeSelected) {

                    case "triangle":
                        area = 0.5*length1*length2;
                        tv_result.setText(area+"");
                        break;

                    case "square":
                        area = length1 * length1;
                        tv_result.setText(area+"");
                        break;

                    case "circle":
                        area = 3.1416 * length1 * length1;
                        tv_result.setText(area+"");
                        break;
                }
            }
        });

    }

    private void clearButton() {
        et_length1.setText("");
        et_length2.setText("");
        tv_result.setText("Result");
        tv_shape.setText("Please choose a Shape");
        et_length1.setVisibility(View.VISIBLE);
        et_length2.setVisibility(View.VISIBLE);
        shapeSelected = "NONE";
    }
}
