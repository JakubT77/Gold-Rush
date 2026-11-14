package edu.io;

public class Board {
    public final int size = 8;
    public Token[][] grid;

    public Board() {
        this.grid = new Token[size][size];
        clean();
    }

    public void clean (){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                grid[row][col] = new Token("・");
            }
        }
    }

    public void placeToken(int row, int col, Token token) {
        grid[row][col] = token;
    }

    public Token peekToken(int row, int col) {
        return grid[row][col];
    }

    public void display() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (grid[row][col] == null) {
                    System.out.print(".  ");
                } else {
                    System.out.print(grid[row][col].label() + " ");
                }
            }
            System.out.println();
        }
    }
}
