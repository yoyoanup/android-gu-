package com.example.yoyoanup.event;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         Button b1,b2;
        final EditText e1;

        b1=(Button)findViewById(R.id.okbt);
        b2=(Button)findViewById(R.id.canbt);
      e1 =(EditText)findViewById(R.id.et1);
        b1.setOnClickListener(

                new Button.OnClickListener(){


                    @Override
                    public void onClick(View v) {

                       //e1 =(EditText)findViewById(R.id.et1);
                        e1.setText("ok clicked");

                       // TextView t1=(TextView)findViewById(R.id.tt);
                        //t1.setText("Welcome user");
                    }
                }






        );



        b2.setOnClickListener(

                new Button.OnClickListener(){


                    @Override
                    public void onClick(View v) {


                        e1.setText("cancel  clicked");
                    }
                }






        );

    }
}
