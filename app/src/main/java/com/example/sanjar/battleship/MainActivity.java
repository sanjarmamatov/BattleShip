package com.example.sanjar.battleship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button nextTurnForPlayer1;
    public GameGrid grid;
    GameGridForPl2 gridForPl2;
    Player1map1 player1map1;
    Player1map2 player1map2;
    Player1map3 player1map3;
    private TextView poleOne;
    TextView poleTwo;
    EditText poleX;
    EditText poleY;
    Button fire;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent4 = getIntent();
        initVars();
        drawPoleOne();
        drawPoleTwo();


        nextTurnForPlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, WaitForP2.class);
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

    private void perehod() {
        Intent intent = new Intent(MainActivity.this, WaitForP2.class);
        startActivity(intent);

    }
    public void drawPlayer1map1() {
        poleTwo.setText("");
        for (int i = 0; i < player1map1.getHeight(); i++){
            for (int j = 0; j < player1map1.getWidth(); j++) {
                String sector1 = "";
                sector1 = Integer.toString(player1map1.getBeepersNumber(j, i));
                poleTwo.append(sector1);
                poleTwo.append("   ");
            }
            poleTwo.append("\n");
        }
    }

    public void drawPlayer1map2() {
        poleTwo.setText("");
        for (int i = 0; i < player1map2.getHeight(); i++){
            for (int j = 0; j < player1map2.getWidth(); j++) {
                String sector1 = "";
                sector1 = Integer.toString(player1map2.getBeepersNumber(j, i));
                poleTwo.append(sector1);
                poleTwo.append("   ");
            }
            poleTwo.append("\n");
        }
    } public void drawPlayer1map3() {
        poleTwo.setText("");
        for (int i = 0; i < player1map3.getHeight(); i++){
            for (int j = 0; j < player1map3.getWidth(); j++) {
                String sector1 = "";
                sector1 = Integer.toString(player1map3.getBeepersNumber(j, i));
                poleTwo.append(sector1);
                poleTwo.append("   ");
            }
            poleTwo.append("\n");
        }
    }


    public void dropBomb(int x, int y) {
             if (player1map1.getContent(x, y) == 2) {
            gridForPl2.placeBobm1(x, y);
            drawPlayer1map1();
        }
            if(player1map1.getContent(x,y)!=2){
            gridForPl2.placeBobm1(x,y);
            drawPoleTwo();
        }
            if(player1map2.getContent(x, y) == 2) {
                gridForPl2.placeBobm1(x, y);
                drawPlayer1map2();
            }
            if(player1map3.getContent(x, y) == 2) {
                gridForPl2.placeBobm1(x, y);
                drawPlayer1map3();
            }



    }
       // else if(grid.getContent(x, y) == 1) {
       //     grid.placeBobm(x, y);
      //      drawPoleOne();
     //   }
   // }


    private void initVars(){
        nextTurnForPlayer1 = (Button) findViewById(R.id.button);
        poleX = (EditText) findViewById(R.id.editText);
        poleY = (EditText) findViewById(R.id.editText2);
        poleOne = (TextView)findViewById(R.id.textView4) ;
        grid = new GameGrid();
        player1map1 = new Player1map1();
        player1map2 = new Player1map2();
        player1map3 = new Player1map3();
        poleTwo =(TextView)findViewById(R.id.textView3);
        gridForPl2 = new GameGridForPl2();
        fire = (Button)findViewById(R.id.button5);


    }

    public void drawPoleOne() {
        poleOne.setText("");
        for (int i = 0; i < grid.getHeight(); i++){
            for (int j = 0; j < grid.getWidth(); j++) {
                String sector = "";
                sector = Integer.toString(grid.getBeepersNumber(j, i));
                poleOne.append(sector);
                poleOne.append("   ");
            }
            poleOne.append("\n");
        }
    }


    public void drawPoleTwo() {
        poleTwo.setText("");
        for (int i = 0; i < gridForPl2.getHeight1(); i++){
            for (int j = 0; j < gridForPl2.getWidth1(); j++) {
                String sector1 = "";
                sector1 = Integer.toString(gridForPl2.getBeepersNumber1(j, i));
                poleTwo.append(sector1);
                poleTwo.append("   ");
            }
            poleTwo.append("\n");
        }
    }
}




