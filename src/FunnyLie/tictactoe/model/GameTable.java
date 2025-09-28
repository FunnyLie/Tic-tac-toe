package FunnyLie.tictactoe.model;

public class GameTable {

    private final char[][] table = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
    };

    public boolean isEmpty(final Cell cell) {
        return table[cell.getRow()][cell.getCol()] == ' ';
    }

    public char getSSign(final Cell cell) {
        return table[cell.getRow()][cell.getCol()];
    }

    public void setSign(final Cell cell, final char sign) {
        table[cell.getRow()][cell.getCol()] = sign;
    }
}

