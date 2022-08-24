package battleship;

public class BoardFactory {

    Input input = new Input();
    int [] userInput = input.getUserInputCoord();



     public void manualPlacement(String direction, int [] startCoordinate, int Length, Ship ship, Square[][] ocean){
         int userX = startCoordinate[0];
         int userY = startCoordinate[1];


         switch (direction) {
             case "up":

                     for (int x = userX; x > x - Length; x--) {
                         Square shipCoordinate =  ocean[x][userY];
                         shipCoordinate.setSquare(SquareType.SHIP);
                         ship.addShipCoordinates(shipCoordinate);
                     }

             case "down":

                    for (int x = userX; x < x + Length; x++) {
                         Square shipCoordinate =  ocean[x][userY];
                         shipCoordinate.setSquare(SquareType.SHIP);
                         ship.addShipCoordinates(shipCoordinate);}
             case "left":

                     for (int y = userY; y > y - Length; y--) {
                         Square shipCoordinate = ocean[userX][y];
                         shipCoordinate.setSquare(SquareType.SHIP);
                         ship.addShipCoordinates(shipCoordinate);

                     }

             case "right":


                     for (int y = userY; y < y + Length; y++) {
                         Square shipCoordinate = ocean[userX][y];
                         shipCoordinate.setSquare(SquareType.SHIP);
                         ship.addShipCoordinates(shipCoordinate);

                         }
                     }



     }
}
