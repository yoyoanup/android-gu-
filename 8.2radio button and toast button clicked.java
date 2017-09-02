package com.example.yoyoanup.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button)findViewById(R.id.btn);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        RadioGroup rg=(RadioGroup)findViewById(R.id.rgg);
        int i=rg.getCheckedRadioButtonId();
        RadioButton rb=(RadioButton) rg.findViewById(i);
        Toast.makeText(getApplicationContext(),"you choose"+rb.getText().toString(),Toast.LENGTH_SHORT).show();
    }
}
