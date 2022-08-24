package battleship;

import java.util.ArrayList;


public class Ship {

    ShipType shipType;

    ArrayList <Square> shipSquares = new ArrayList<Square>();





    public Ship(ShipType type) {
        this.shipType = type;
    }

    public ShipType getShipType(){
        return this.shipType;
    }

    public void addShipCoordinates(Square shipSquare){
        this.shipSquares.add(shipSquare);
    }

    public boolean isSunk(){
        int counter = 0;
        for (Square square: shipSquares){
            if (square.getSquare() == SquareType.HIT) {
                counter++;
            }
        }
        if (counter == shipSquares.size()){
            for (Square square: shipSquares){
                square.setSquare(SquareType.SUNK);
            }
            return true;
        }
        return false;
    }

}
