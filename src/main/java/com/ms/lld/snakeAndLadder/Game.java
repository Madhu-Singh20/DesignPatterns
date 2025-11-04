package com.ms.lld.snakeAndLadder;

import lombok.Data;

import java.util.ArrayDeque;
import java.util.Deque;

@Data
public class Game {

    Board board;
    Dice dice;
    Deque<Player> players=new ArrayDeque<>();
    Player winner;

    public Game(){
        initializeGame();
    }

    private void initializeGame(){
        board=new Board(10, 5, 4);
        dice=new Dice(1);
        winner=null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1=new Player("p1", 0);
        Player player2=new Player("p2", 0);
        players.add(player1);
        players.add(player2);
    }

    public void startGame() {
        while (winner==null){
            Player currPlayer= playerInTurn();
            System.out.println("Current player : "+ currPlayer.getId()+" at position : "+currPlayer.getCurrentPosition());

            int numberOnDice= dice.rollDice();
            System.out.println("Number on Dice : "+ numberOnDice);
            int targetPosition=currPlayer.getCurrentPosition()+numberOnDice;

            targetPosition=checkJump(targetPosition);

            System.out.println("New position of "+currPlayer.getId()+ " is "+targetPosition);
            currPlayer.setCurrentPosition(targetPosition);
            if(targetPosition>board.getCells().length*board.getCells().length-1){
                winner=currPlayer;
                System.out.println("Winner "+ currPlayer.getId());
            }

        }
    }

    private int checkJump(int targetPosition) {
        if(targetPosition> board.getCells().length*board.getCells().length-1){
            return  targetPosition;
        }
        int row= targetPosition /board.getCells().length;
        int column= targetPosition %board.getCells().length;
        Cell cell=board.getCells()[row][column];
        if(cell.jump!=null && cell.getJump().getStart()==targetPosition){
            return cell.getJump().getEnd();
        }
        return targetPosition;
    }

    private Player playerInTurn() {
        Player player=players.removeFirst();
        players.addLast(player);
        return player;
    }
}
