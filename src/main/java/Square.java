

public class Square {

    private SquareType square;

    private Square(SquareType square) {
        this.square = square;
    }

    public SquareType getSquare() {
        return square;
    }

    public void setSquare(SquareType square) {
        this.square = square;
    }
}
