package battleship;

import java.util.ArrayList;

public class Player {
     Board board = new Board();
     Square [][] ocean = board.getOcean();

     ArrayList <Ship> ships = new ArrayList<Ship>();
     private boolean alive = true;

     public Square[][] getBoard(){
          return this.ocean;
     }

     public void setAlive(boolean alive){
         this.alive = alive;
     }

     public void shootEnemy(Square[][] ocean, int[] coordinate, Ship ship){
          int userX = coordinate[0];
          int userY = coordinate[1];
          if (isHit(coordinate, ship)){
               ocean[userX][userY].setSquare(SquareType.HIT);
          } else {
               ocean[userX][userY].setSquare(SquareType.MISSED);
          }

     }

     public boolean isHit(int[] coordinate, Ship ship){
          int userX = coordinate[0];
          int userY = coordinate[1];
          if (ocean[userX][userY].getSquare() == SquareType.SHIP){
               ship.isSunk();
               return true;
          }
          return false;
     }
}