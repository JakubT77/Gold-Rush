package edu.io;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Token player = new Token("웃");
        Token gold = new Token("💰");
        board.placeToken(0, 0, player);
        board.placeToken(5, 5, gold);
        board.display();
    }
}