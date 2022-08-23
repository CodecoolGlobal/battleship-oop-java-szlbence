public class Board {
    public Square[][] getOcean() {
        return ocean;
    }

    final private Square[][] ocean;

    Board(){

        ocean = new Square[10][10];
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                ocean[row][col] = new Square(SquareType.EMPTY);
            }
        }
    }

    boolean isPlacementOk(){
        return false;
    }

}
