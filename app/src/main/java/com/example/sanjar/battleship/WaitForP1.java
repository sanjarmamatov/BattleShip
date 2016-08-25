package com.example.sanjar.battleship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WaitForP1 extends AppCompatActivity {
    Button activ4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait_for_p1);

        activ4 =(Button)findViewById(R.id.button4);
        Intent intent3 = getIntent();


        activ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(WaitForP1.this, MainActivity.class);
                startActivity(intent4);
            }
        });


    }
}



