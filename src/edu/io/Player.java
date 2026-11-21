package edu.io;

public class Player {
    private Board board;
    private Token token = new Token("웃");
    private int row;
    private int col;
    private int gold = 0;

    public Player(Board board, int row, int col) {
        this.board = board;
        this.row = row;
        this.col = col;
        board.placeToken(row, col, token);
    }

    public void move(int stepRow, int stepCol) {
        int newRow = row + stepRow;
        int newCol = col + stepCol;

        if (!board.isInside(newRow, newCol)) {
            return;
        }

        Token target = board.peekToken(newRow, newCol);
        if (target instanceof GoldToken) {
            GoldToken g = (GoldToken) target;
            gold = gold + g.amount;
        }

        board.clearField(row, col);
        row = newRow;
        col = newCol;
        board.placeToken(row, col, token);
    }

    public int gold() {
        return gold;
    }
}