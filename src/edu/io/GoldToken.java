package edu.io;

public class GoldToken extends Token {
    public final int amount;

    public GoldToken(int amount) {
        super("💰");
        this.amount = amount;
    }
}
