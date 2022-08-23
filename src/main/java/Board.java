public class Board {
    public Square[][] getOcean() {
        return ocean;
    }

    final private Square[][] ocean;

    Board() {

        ocean = new Square[10][10];
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                ocean[row][col] = new Square(SquareType.EMPTY);
            }
        }
    }

    boolean isPlacementOk(int Length, String direction, int[] startCoordinate) {
        int userX = startCoordinate[0];
        int userY = startCoordinate[1];

        switch (direction) {
            case "up":
                if (userX - (Length - 1) < 0) {
                    return false;
                } else {
                    for (int x = userX; x > x - Length; x--) {
                        if (ocean[x][userY].getSquare() != SquareType.EMPTY) {
                            return false;
                        }
                    }
                    return true;
                }

            case "down":
                if (userX + (Length - 1) > 9) {
                    return false;
                }
                else {
                    for (int x = userX; x < x + Length; x++) {
                        if (ocean[x][userY].getSquare() != SquareType.EMPTY) {
                            return false;
                        }
                    }
                    return true;
                }
            case "left":
                if (userY - (Length - 1) < 0) {
                    return false;
                }
                else {
                    for (int y = userY; y > y - Length; y--) {
                        if (ocean[userX][y].getSquare() != SquareType.EMPTY) {
                            return false;
                        }
                    }
                    return true;
                }
            case "right":
                if (userY + (Length - 1) > 9) {
                    return false;
                }
                else {
                    for (int y = userY; y < y + Length; y++) {
                        if (ocean[userX][y].getSquare() != SquareType.EMPTY) {
                            return false;
                        }
                    }
                    return true;
                }
        }
        return false;

    }
}
