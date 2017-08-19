package com.example.yoyoanup.toast2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(
                new Button.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        TextView t1=(TextView)findViewById(R.id.textView);
                        EditText e1=(EditText)findViewById(R.id.editText);

                        t1.setText("text text changed");
                        e1.setText("edit text changed");

                        Toast.makeText(getApplication(),"ahup thakur", Toast.LENGTH_SHORT).show();
                    }
                }

        );
    }
}
