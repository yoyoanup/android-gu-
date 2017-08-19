package com.example.yoyoanup.printname;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button)findViewById(R.id.btn);

        b1.setOnClickListener(
                new Button.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        EditText e1=(EditText)findViewById(R.id.editname);
                        TextView t1=(TextView)findViewById(R.id.txt);

                       // String name="Anup";
                        String name=e1.getText().toString();

                        t1.setText("your name is "+name);
                    }
                }

        );
    }
}
