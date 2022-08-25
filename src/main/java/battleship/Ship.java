package battleship;

import java.util.ArrayList;


public class Ship {

    ShipType shipType;

    Display display = new Display();

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

    public void isSunk(){
        int counter = 1;
        for (Square square: shipSquares){
            if (square.getSquare() == SquareType.HIT) {
                counter++;
            }
        }
        if (counter == shipSquares.size()){
            for (Square square: shipSquares){
                square.setSquare(SquareType.SUNK);
            }
            display.displayMsg(shipType.name() + " is sunk.");
        }
    }

}
