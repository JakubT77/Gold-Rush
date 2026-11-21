package edu.io;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Player player = new Player(board, 0, 0);
        board.placeToken(0, 2, new GoldToken(10));

        board.display();
        System.out.println();

        player.move(0, 1);
        player.move(0, 1);

        board.display();
        System.out.println("Złoto: " + player.gold());
    }
}