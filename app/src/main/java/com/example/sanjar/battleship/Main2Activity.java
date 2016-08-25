package com.example.sanjar.battleship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    EditText poleX;
    EditText poleY;
    Button nextTurnForPlayer2;
    TextView poleOdin;
    TextView poleDwa;
    Game2Grid grid2;
    Game2GridForPl2 grid2ForPl2;
    Button fire;
    Player2map1 player2map1;
    Player2map2 player2map2;
    Player2map3 player2map3;
    GameGridForPl2 gridForPl2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent2 = getIntent();

        initVars();
        drawPoleOdin();
        drawPoleDwa();


        nextTurnForPlayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, WaitForP1.class);
                startActivity(intent);
            }
        });



        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(poleX.getText().toString());
                int y = Integer.parseInt(poleY.getText().toString());
                dropBomb(x, y);
                perehod();


            }
        });


    }








    public void dropBomb(int x, int y) {
        if (player2map1.getContent(x, y) == 2) {
            grid2ForPl2.placeBobm(x, y);
            drawPlayer2map1();
        }
        if(player2map1.getContent(x,y)!=2){
            grid2ForPl2.placeBobm(x,y);
            drawPlayer2map1();
        }
        if(player2map2.getContent(x, y) == 2) {
            grid2ForPl2.placeBobm(x, y);
            drawPlayer2map2();
        }
        if(player2map3.getContent(x, y) == 2) {
            grid2ForPl2.placeBobm(x, y);
            drawPlayer2map3();
        }
    }


    private void perehod() {
        Intent intent3 = new Intent(Main2Activity.this, WaitForP1.class);
        startActivity(intent3);
    }



    public void drawPlayer2map1() {
        poleDwa.setText("");
        for (int i = 0; i < player2map1.getHeight(); i++){
            for (int j = 0; j < player2map1.getWidth(); j++) {
                String sector = "";
                sector = Integer.toString(player2map1.getBeepersNumber(j, i));
                poleDwa.append(sector);
                poleDwa.append("   ");
            }
            poleDwa.append("\n");
        }
    }

    public void drawPlayer2map2() {
        poleDwa.setText("");
        for (int i = 0; i < player2map2.getHeight(); i++){
            for (int j = 0; j < player2map2.getWidth(); j++) {
                String sector = "";
                sector = Integer.toString(player2map2.getBeepersNumber(j, i));
                poleDwa.append(sector);
                poleDwa.append("   ");
            }
            poleDwa.append("\n");
        }
    }

    public void drawPlayer2map3() {
        poleDwa.setText("");
        for (int i = 0; i < player2map3.getHeight(); i++){
            for (int j = 0; j < player2map3.getWidth(); j++) {
                String sector = "";
                sector = Integer.toString(player2map3.getBeepersNumber(j, i));
                poleDwa.append(sector);
                poleDwa.append("   ");
            }
            poleDwa.append("\n");
        }
    }



    public void drawPoleDwa() {
        poleDwa.setText("");
        for (int i = 0; i < grid2ForPl2.getHeight(); i++){
            for (int j = 0; j < grid2ForPl2.getWidth(); j++) {
                String sector = "";
                sector = Integer.toString(grid2ForPl2.getBeepersNumber(j, i));
                poleDwa.append(sector);
                poleDwa.append("   ");
            }
            poleDwa.append("\n");
        }
    }

    public void drawPoleOdin() {
        poleOdin.setText("");
        for (int i = 0; i < grid2.getHeight(); i++){
            for (int j = 0; j < grid2.getWidth(); j++) {
                String sector = "";
                sector = Integer.toString(grid2.getBeepersNumber(j, i));
                poleOdin.append(sector);
                poleOdin.append("   ");
            }
            poleOdin.append("\n");
        }
    }


    private void initVars(){
        poleOdin = (TextView) findViewById(R.id.textView2);
        poleDwa = (TextView) findViewById(R.id.textView5);
        grid2ForPl2 = new Game2GridForPl2();
        grid2 = new Game2Grid();
        poleX = (EditText)findViewById(R.id.editText);
        poleY = (EditText)findViewById(R.id.editText2);
        fire = (Button)findViewById(R.id.button3);
        player2map1 = new Player2map1();
        player2map2 = new Player2map2();
        player2map3 = new Player2map3();
        gridForPl2 = new GameGridForPl2();
        nextTurnForPlayer2 = (Button)findViewById(R.id.button6);


    }
}
