package com.ms.lld.ticTacToe;

public class Player {

    int id;
    String name;
    PlayingPiece playingPiece;

    public Player(PlayingPiece playingPiece, int id, String name) {
        this.playingPiece = playingPiece;
        this.id = id;
        this.name = name;
    }
}
