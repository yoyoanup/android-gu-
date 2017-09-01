package com.example.yoyoanup.gen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioGroup rgj;
    RadioButton rbj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.btn);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        rgj =(RadioGroup)findViewById(R.id.rg);
        //rbj=(RadioButton)findViewById(R.id.rb);
        int id=rgj.getCheckedRadioButtonId();
        rbj=(RadioButton)findViewById(id);

        Toast.makeText(getApplicationContext(),rbj.getText().toString(),Toast.LENGTH_SHORT).show();;
    }
}
