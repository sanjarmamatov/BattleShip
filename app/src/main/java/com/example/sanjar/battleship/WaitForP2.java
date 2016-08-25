package com.example.sanjar.battleship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WaitForP2 extends AppCompatActivity {

    Button activ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait_for_p2);

        Intent intent = getIntent();




        activ2 = (Button)findViewById(R.id.button2);

        activ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(WaitForP2.this, Main2Activity.class);
                startActivity(intent2);

            }
        });




    }
}
