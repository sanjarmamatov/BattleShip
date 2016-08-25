package com.example.sanjar.battleship;

/**
 * Created by Sanjar on 25.08.2016.
 */
public class Game2Grid {

    public Game2Grid() {
        map = new int[5][5];
        map[4][2] = 1;
        map [2][0] = 1;
        map [1][3] = 1;



    }

    public int getWidth() {
        return map.length;
    }

    public int getHeight() {
        return map[0].length;
    }

    private int[][] map = null;

    public int getBeepersNumber(int x, int y) {
        return map[x][y];
    }

    public int getContent(int x, int y) {
        return map[x][y];
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void placeBobm(int x, int y) {
        map[x][y] = map[x][y] + 1;
    }

    public void setContent(int x, int y, char symbol) {
        map[x][y] = symbol;
    }

    private int turn;

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
