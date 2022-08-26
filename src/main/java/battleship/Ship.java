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

    public void isSunk(ArrayList <Square> ship){
        int counter = 1;
        for (Square square: ship){
            if (square.getSquare() == SquareType.HIT) {
                counter++;
            }
        }
        if (counter == ship.size()){
            for (Square square: ship){
                square.setSquare(SquareType.SUNK);
            }
            display.displayMsg(shipType.name() + " is sunk.");
        }
    }

}
