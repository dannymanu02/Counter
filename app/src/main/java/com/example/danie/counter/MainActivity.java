package com.example.danie.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Click(View view){
        count=count+1;
        //display(count);
            TextView tv =  findViewById(R.id.textView);
            tv.setText(""+count);
    }

    public void reset(View view){
        count = 0;
        TextView tr = findViewById(R.id.textView);
        tr.setText(""+count);
    }

   /* private void display(int num){
        TextView tv =  findViewById(R.id.textView);
        tv.setText(""+num);
    }*/

}
