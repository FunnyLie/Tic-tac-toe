package FunnyLie.tictactoe;

import FunnyLie.tictactoe.components.*;
import FunnyLie.tictactoe.components.Keypad.DesktopNumericKeypadCellNumberConverter;

public final class Launcher {
    public static void main(String[] args) {
        final CellNumberConverter cellNumberConverter = new DesktopNumericKeypadCellNumberConverter();
        final Game game = new Game(
                new DataPrinter(cellNumberConverter),
                new ComputerMove(),
                new UserMove(cellNumberConverter),
                new WinnerVerifier(),
                new CellVerifier()
        );
        game.play();
    }
}
