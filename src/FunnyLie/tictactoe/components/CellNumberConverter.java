package FunnyLie.tictactoe.components;

import FunnyLie.tictactoe.model.Cell;

public interface CellNumberConverter {

    Cell toCell(char number);

    char toNumber(Cell cell);
}