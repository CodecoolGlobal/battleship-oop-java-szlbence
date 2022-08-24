package battleship;

public class BoardFactory {

    Input input = new Input();

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

    public void manualPlacement(Square[][] ocean) {
        for (ShipType shiptype : ShipType.values()) {
            boolean validInput = false;
            int Length = shiptype.shipSize;
            var startCoordinate = input.getUserInputCoord();
            String direction = input.getUserInputShipDir();
            while (!validInput) {
                validInput = Board.isPlacementOk(Length, direction, startCoordinate);
            }
            placeShip(direction, startCoordinate, ocean, shiptype);
        }
    }
}
