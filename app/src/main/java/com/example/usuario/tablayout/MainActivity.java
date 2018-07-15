package com.example.usuario.tablayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button []button=new Button[10];
    int []IdButtons={R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getvalueButtons();
    }

    public void getvalueButtons()
    {

        for (int i =0;i<IdButtons.length;i++)
        {
            button[i]=findViewById(IdButtons[i]);
            final int finalI = i;
            button[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(),button[finalI].getText().toString(),Toast.LENGTH_SHORT).show();
                }
            });

        }

    }
}
