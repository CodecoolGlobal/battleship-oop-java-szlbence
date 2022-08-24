

public class BoardFactory {

    Input input = new Input();
    int [] userInput = input.getUserInputCoord();
    Board board = new Board();
    Square [][] ocean = board.getOcean();


     public void manualPlacement(String direction, int [] startCoordinate, int Length){
         int userX = startCoordinate[0];
         int userY = startCoordinate[1];

         switch (direction) {
             case "up":

                     for (int x = userX; x > x - Length; x--) {
                         ocean[x][userY].setSquare(SquareType.SHIP);}

             case "down":


                     for (int x = userX; x < x + Length; x++) {
                         ocean[x][userY].setSquare(SquareType.SHIP); }
             case "left":

                     for (int y = userY; y > y - Length; y--) {
                         ocean[userX][y].setSquare(SquareType.SHIP); }

             case "right":


                     for (int y = userY; y < y + Length; y++) {
                         ocean[userX][y].setSquare(SquareType.SHIP);

                         }
                     }



     }
}
