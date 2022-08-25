package battleship;

import java.util.concurrent.TimeUnit;

public class Game {

    BoardFactory boardFactory = new BoardFactory();
    Player actualPlayer;
    Player enemyPlayer;

    Display display = new Display();

    Input input = new Input();

    public void gameLogic() throws InterruptedException {
        display.displayMenu();
        int option = input.getUserInputMainMenu();
        initGame(option);


        boolean isGameRunning = true;
        while (isGameRunning) {
            display.displayMsg("Please shoot, " + actualPlayer.getName() + ": ");
            display.displayOcean(enemyPlayer.getBoard().getOcean());
            int[] shotCoordinate;
            if (actualPlayer instanceof ComputerPlayer)
                ((ComputerPlayer) actualPlayer).shootEnemy(enemyPlayer.getBoard().getOcean(),enemyPlayer);
            else {
                shotCoordinate = input.getUserInputCoord();
                actualPlayer.shootEnemy(enemyPlayer,shotCoordinate);
            }
            display.displayOcean(enemyPlayer.getBoard().getOcean());
            TimeUnit.SECONDS.sleep(1);
            if (enemyPlayer.isAlive()) switchPlayer();
            else {
                display.displayResults(actualPlayer.getName());
                isGameRunning = false;
            }
        }

        /*Square[][] testOcean = ocean.getOcean();
        Display.displayOcean(testOcean);*/

    }

    private void initGame(int option) {
        switch (option){
            case 1:
                initShipPlacement("manual",true);
                break;
            case 2:
                initShipPlacement("random",true);
                break;
            case 3:
                initShipPlacement("manual", false);
                break;
            case 4:
                initShipPlacement("random",false);
                break;
            case 5:
                // TODO: HIGH SCORE
                break;
            case 6:
                System.exit(1);
        }
    }

    private void initShipPlacement(String isRandom, boolean isHuman) {
        actualPlayer = new Player(input.getUserInputName());
        display.displayPlacement(actualPlayer.getBoard().getOcean());
        boardFactory.manualPlacement(actualPlayer.getBoard().getOcean(), actualPlayer, isRandom);
        if (isHuman){
            this.enemyPlayer = new Player(input.getUserInputName());
        } else {
            this.enemyPlayer = new ComputerPlayer();
        }
        display.displayPlacement(enemyPlayer.getBoard().getOcean());
        boardFactory.manualPlacement(enemyPlayer.getBoard().getOcean(), enemyPlayer, isRandom);

    }

    private void switchPlayer(){
         Player actual = this.actualPlayer;
         actualPlayer = enemyPlayer;
         enemyPlayer = actual;
    }
}
