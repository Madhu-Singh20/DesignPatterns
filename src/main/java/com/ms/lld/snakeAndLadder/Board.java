package com.ms.lld.snakeAndLadder;

import lombok.Data;

import java.util.concurrent.ThreadLocalRandom;

@Data
public class Board {

    private Cell[][] cells;

    public Board(int boardSize, int numberOfSnake, int numberOfLadder){
        initializeCells(boardSize);

        addSnakesAndLadders(numberOfSnake, numberOfLadder);

    }

    private void addSnakesAndLadders(int numberOfSnake, int numberOfLadder) {
        while (numberOfSnake>0){
            int snakeStart=ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int snakeEnd=ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(snakeStart<snakeEnd){
                continue;
            }

            Cell cell=getCell(snakeStart);
            Jump snakeJump=new Jump(snakeStart,snakeEnd);
            cell.setJump(snakeJump);
            numberOfSnake--;
        }

        while (numberOfLadder > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if (ladderStart > ladderEnd) {
                continue;
            }

            Cell cell = getCell(ladderEnd);
            Jump snakeJump = new Jump(ladderStart, ladderEnd);
            cell.setJump(snakeJump);
            numberOfLadder--;

        }
    }

    private void initializeCells(int boardSize) {
        cells=new Cell[boardSize][boardSize];

        for(int i = 0; i< boardSize; i++){
            for(int j = 0; j< boardSize; j++){
                Cell cell=new Cell();
                cells[i][j]=cell;
            }
        }
    }

    private Cell getCell(int num){
        int i=num / cells.length;
        int j=num % cells.length;
        return cells[i][j];
    }

}
