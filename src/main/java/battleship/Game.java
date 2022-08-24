package battleship;

public class Game {

    BoardFactory boardFactory = new BoardFactory();
    Display display = new Display();

    public void gameLogic() {
        display.displayMenu();
        Player player = new Player();
        Board ocean = player.board;
        display.displayPlacement(ocean.getOcean());
        boardFactory.manualPlacement(ocean.getOcean(), player);

        /*Square[][] testOcean = ocean.getOcean();
        Display.displayOcean(testOcean);*/

    }
}
