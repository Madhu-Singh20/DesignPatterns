package com.ms.lld.ticTacToe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {

    Board board;
    Deque<Player> players;

    public void initializeGame(){
        board=new Board(3);
        players=new ArrayDeque<>();

        Player player1=new Player(new PlayingPieceX(PlayingPieceType.X), 1, "Madhu" );
        Player player2=new Player(new PlayingPieceX(PlayingPieceType.O), 2, "Diya" );

        players.add(player1);
        players.add(player2);

    }

    public void startGame(){
        String winner=null;
        boolean noSpaceleft=false;
        Player currPlayer=null;
        while(!noSpaceleft) {
            currPlayer = players.pollFirst();
            if(board.isFull()){
                noSpaceleft=true;
                continue;
            }
            board.printBoard();

            System.out.println(currPlayer.name + " enter location : ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputArray = input.split(",");
            int row = Integer.parseInt(inputArray[0]);
            int column = Integer.parseInt(inputArray[1]);

            if (board.addPiece(row, column, currPlayer.playingPiece)) {
                if(board.lineMatched()){
                    winner= currPlayer.name;
                    break;
                }
                players.addLast(currPlayer);
            } else {
                System.out.println("Wrong location entered. Try again ");
                players.addFirst(currPlayer);
            }
        }
        if(winner!=null) {
            System.out.println("Winner is : "+currPlayer.name);
        }else{
            System.out.println("Match got Tie");
        }
    }
}
