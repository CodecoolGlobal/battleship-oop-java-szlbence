package battleship;

public class BoardFactory {

    Input input = new Input();

    public void placeShip(String direction, int[] startCoordinate, Square[][] ocean, ShipType shiptype, Player player) {

        Ship ship = new Ship(shiptype);
        player.addShip(ship);

        int userX = startCoordinate[0];
        int userY = startCoordinate[1];

        int Length = ship.shipType.shipSize;


        switch (direction) {
            case "up":

                for (int x = userX; x > userX - Length; x--) {
                    Square shipCoordinate = ocean[x][userY];
                    shipCoordinate.setSquare(SquareType.SHIP);
                    ship.addShipCoordinates(shipCoordinate);
                }
                break;

            case "down":

                for (int x = userX; x < userX + Length; x++) {
                    Square shipCoordinate = ocean[x][userY];
                    shipCoordinate.setSquare(SquareType.SHIP);
                    ship.addShipCoordinates(shipCoordinate);
                }
                break;
            case "left":

                for (int y = userY; y > userY - Length; y--) {
                    Square shipCoordinate = ocean[userX][y];
                    shipCoordinate.setSquare(SquareType.SHIP);
                    ship.addShipCoordinates(shipCoordinate);

                }
                break;
            case "right":


                for (int y = userY; y < userY + Length; y++) {
                    Square shipCoordinate = ocean[userX][y];
                    shipCoordinate.setSquare(SquareType.SHIP);
                    ship.addShipCoordinates(shipCoordinate);

                }
                break;
        }


    }

    public void manualPlacement(Square[][] ocean, Player player) {
        Display display = new Display();
        for (ShipType shiptype : ShipType.values()) {
            boolean validInput = false;
            String direction = "";
            int[] startCoordinate = new int[2];
            int Length = shiptype.shipSize;
            while (!validInput) {
            display.displayMsg(player.getName() + ", please provide the starting coordinate of your "+ shiptype +" (length:" + Length +") :");
            startCoordinate = input.getUserInputCoord();
            display.displayMsg(player.getName() + ", please provide the direction of your "+ shiptype +" (length:" + Length +") :");
            direction = input.getUserInputShipDir();
                validInput = player.getBoard().isPlacementOk(Length, direction, startCoordinate);
            }
            placeShip(direction, startCoordinate, ocean, shiptype, player);
            display.displayPlacement(ocean);
        }
    }
}
