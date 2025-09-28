package FunnyLie.tictactoe.components;

import FunnyLie.tictactoe.model.Cell;
import FunnyLie.tictactoe.model.GameTable;

import java.util.Random;

public class ComputerMove {
    public void make(final GameTable gameTable) {
        final Random random = new Random();
        while (true) {
            final int number1 = new Random().nextInt(3);
            final int number2 = new Random().nextInt(3);
            final Cell randomCell = new Cell(number1, number2);
            if (gameTable.isEmpty(randomCell)) {
                gameTable.setSign(randomCell, '0');
                return;
            }
        }
    }
}

