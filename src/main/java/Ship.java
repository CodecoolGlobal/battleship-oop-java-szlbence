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

}
