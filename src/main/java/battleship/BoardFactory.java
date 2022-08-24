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

    public void manualPlacement(Square[][] ocean, Player player, String random) {
        for (ShipType shiptype : ShipType.values()) {
            boolean validInput = false;
            int Length = shiptype.shipSize;

            int[] startCoordinate = new int[2];
            String direction = "";

            if (random == "random") {
                startCoordinate = input.getUserInputCoord();
                direction = input.getUserInputShipDir();
            } else if (random == "manual") {
                startCoordinate = Util.generateRandomCoordinate();
                direction = Util.generateDirection();
            }
                while (!validInput) {
                    validInput = Board.isPlacementOk(Length, direction, startCoordinate);
                }
                placeShip(direction, startCoordinate, ocean, shiptype, player);

        }
    }
}
