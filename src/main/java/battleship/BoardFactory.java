package battleship;

public class BoardFactory {

    Input input = new Input();
    int[] userInput = input.getUserInputCoord();


    public void placeShip(String direction, int[] startCoordinate, Square[][] ocean, ShipType shiptype) {

        Ship ship = new Ship(shiptype);

        int userX = startCoordinate[0];
        int userY = startCoordinate[1];

        int Length = ship.shipType.shipSize;


        switch (direction) {
            case "up":

                for (int x = userX; x > x - Length; x--) {
                    Square shipCoordinate = ocean[x][userY];
                    shipCoordinate.setSquare(SquareType.SHIP);
                    ship.addShipCoordinates(shipCoordinate);
                }

            case "down":

                for (int x = userX; x < x + Length; x++) {
                    Square shipCoordinate = ocean[x][userY];
                    shipCoordinate.setSquare(SquareType.SHIP);
                    ship.addShipCoordinates(shipCoordinate);
                }
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

    public void manualPlacement(String direction, int[] startCoordinate, Square[][] ocean) {
        for (ShipType shiptype : ShipType.values())
            placeShip(direction, startCoordinate, ocean, shiptype);
    }
}
