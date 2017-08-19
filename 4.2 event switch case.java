package com.example.yoyoanup.aswitch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1=(Button)findViewById(R.id.btn1);
        Button b2=(Button)findViewById(R.id.btn2);

        b1.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView t1=(TextView)findViewById(R.id.tx);

                    }
                }

        );

         
}
