package com.zuohp.myclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.zuohp.myclock.view.Clock;

public class MainActivity extends AppCompatActivity {

    private Clock clock_view;
    private EditText edit1;
    private EditText edit2;
    private EditText edit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clock_view = findViewById(R.id.clock_view);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        edit1.setInputType( InputType.TYPE_CLASS_NUMBER);
        edit2.setInputType( InputType.TYPE_CLASS_NUMBER);
        edit3.setInputType( InputType.TYPE_CLASS_NUMBER);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hh = edit1.getText().toString();
                String mm = edit2.getText().toString();
                String ss = edit3.getText().toString();
                clock_view.setTime(Integer.parseInt(hh),Integer.parseInt(mm),Integer.parseInt(ss));
            }
        });
    }
}
