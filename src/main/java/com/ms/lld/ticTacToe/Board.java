package com.ms.lld.ticTacToe;

public class Board {

    private int size;
    private PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int i,int j,PlayingPiece playingPiece){
        if(board[i][j]!=null){
            return false;
        }
        board[i][j]=playingPiece;
        return true;
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0; j<size; j++){
                if(board[i][j]!=null) {
                    System.out.print(board[i][j].playingPieceType.name());
                }
                if(j!=2){
                    System.out.print("|      ");
                }
            }
            System.out.println("\n");
        }
    }

    public boolean isFull(){
        for(int i=0;i<size;i++){
            for(int j=0; j<size; j++){
                if(board[i][j]==null){
                  return false;
                 }
            }
        }
        return true;
    }

    public boolean lineMatched() {
        // Check rows
        for (int row = 0; row < size; row++) {
            if (board[row][0] == null) continue;
            boolean rowMatched = true;
            for (int col = 1; col < size; col++) {
                if (board[row][col] == null ||
                        board[row][col].playingPieceType != board[row][0].playingPieceType) {
                    rowMatched = false;
                    break;
                }
            }
            if (rowMatched) return true;
        }

        // Check columns
        for (int col = 0; col < size; col++) {
            if (board[0][col] == null) continue;
            boolean colMatched = true;
            for (int row = 1; row < size; row++) {
                if (board[row][col] == null ||
                        board[row][col].playingPieceType != board[0][col].playingPieceType) {
                    colMatched = false;
                    break;
                }
            }
            if (colMatched) return true;
        }

        // Check left diagonal (top-left to bottom-right)
        boolean leftDiagMatched = board[0][0] != null;
        for (int i = 1; i < size && leftDiagMatched; i++) {
            if (board[i][i] == null ||
                    board[i][i].playingPieceType != board[0][0].playingPieceType) {
                leftDiagMatched = false;
            }
        }
        if (leftDiagMatched) return true;

        // Check right diagonal (top-right to bottom-left)
        boolean rightDiagMatched = board[0][size - 1] != null;
        for (int i = 1; i < size && rightDiagMatched; i++) {
            if (board[i][size - 1 - i] == null ||
                    board[i][size - 1 - i].playingPieceType != board[0][size - 1].playingPieceType) {
                rightDiagMatched = false;
            }
        }
        if (rightDiagMatched) return true;

        // No line matched
        return false;
    }


}
