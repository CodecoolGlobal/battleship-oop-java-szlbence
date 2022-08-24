package battleship;

public class Game {

    BoardFactory boardFactory = new BoardFactory();
    Display display = new Display();

    Input input = new Input();

    public void gameLogic() {
        display.displayMenu();

        // START OF THE GAME, SHIP PLACEMENTS FOR BOTH PLAYER
        display.displayMsg("Please give me your name player1:");
        String name1 = input.getUserInputName();
        Player player1 = new Player(name1);
        Board ocean1 = player1.board;
        display.displayPlacement(ocean1.getOcean());
        boardFactory.manualPlacement(ocean1.getOcean(), player1); // TODO: Need to fix validation for placement, Carrier (1length) cannot be put at A1 UP and LEFT.

        display.displayMsg("Please give me your name player2:");
        String name2 = input.getUserInputName();
        Player player2 = new Player(name2);
        Board ocean2 = player2.board;
        display.displayPlacement(ocean2.getOcean());
        boardFactory.manualPlacement(ocean2.getOcean(), player2);

        /*Square[][] testOcean = ocean.getOcean();
        Display.displayOcean(testOcean);*/

    }
}
