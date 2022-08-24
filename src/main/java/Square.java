

public class Square {

    @Override
    public String toString() {
        return "Square{" +
                "square=" + square +
                '}';
    }

    private SquareType square;

    protected Square(SquareType square) {
        this.square = square;
    }

    public SquareType getSquare() {
        return square;
    }

    public void setSquare(SquareType square) {
        this.square = square;
    }
}
