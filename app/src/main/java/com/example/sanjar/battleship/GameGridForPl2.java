package com.example.sanjar.battleship;

/**
 * Created by Sanjar on 24.08.2016.
 */
public class GameGridForPl2 {

    public GameGridForPl2() {
        map1 = new int[5][5];
    }
    public int getWidth1() {
        return map1.length;
    }
    public int getHeight1() {
        return map1[0].length;
    }
    private int[][] map1 = null;
    public int getBeepersNumber1(int x, int y) {
        return map1[x][y];
    }
    public int getContent1(int x, int y) {
        return  map1 [x][y];
    }
    private String message1;
    public String getMessage1() {
        return message1;
    }
    public void setMessage1(String message1){
        this.message1 = message1;
    }
    public void placeBobm1 (int x, int y) {
        map1[x][y] = map1[x][y] + 1;
    }
    public void setContent1(int x, int y, char symbol1){
        map1 [x][y] = symbol1;
    }
    private int turn1;
    public int getTurn1() {
        return turn1;
    }
    public void setTurn1(int turn1) {
        this.turn1 = turn1;
    }
}
