package battleship;

import java.util.ArrayList;

public class Player {
     Board board = new Board();
     Square [][] ocean = board.getOcean();

     String name;

     Player(String name){
          this.name = name;
     }

     public String getName() {
          return name;
     }

     ArrayList <Ship> ships = new ArrayList<Ship>();
     private boolean isalive = true;

     public void addShip(Ship ship){
          this.ships.add(ship);
     }
     public Square[][] getBoard(){
          return this.ocean;
     }

     public void setIsAlive(boolean isAlive){
          int count = 0;
          for(Ship ship: ships){
              for(Square square : ship.shipSquares){
                   if(square.getSquare() != SquareType.SUNK)  count++ ;
              }
         }
          if(count > 0) this.isalive = false;
     }

     public void shootEnemy(Square[][] ocean, int[] coordinate){
          int userX = coordinate[0];
          int userY = coordinate[1];
          if (isHit(coordinate)){
               ocean[userX][userY].setSquare(SquareType.HIT);
          } else {
               ocean[userX][userY].setSquare(SquareType.MISSED);
          }

     }

     public boolean isHit(int[] coordinate){
          int userX = coordinate[0];
          int userY = coordinate[1];
          if (ocean[userX][userY].getSquare() == SquareType.SHIP){


               //ship.isSunk();
               return true;
          }
          return false;
     }
}