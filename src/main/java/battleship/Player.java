package battleship;

import java.util.ArrayList;

public class Player {
     private Board board = new Board();
     // Square [][] ocean = board.getOcean();

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
     public Board getBoard(){
          return this.board;
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

     public void shootEnemy(Player player, int[] coordinate){

          if (isHit(player, coordinate)){
               player.getBoard().setOcean(SquareType.HIT, coordinate);
          }
          else {
               player.getBoard().setOcean(SquareType.MISSED, coordinate);
          }

     }

     public boolean isHit(Player player, int[] coordinate){
          int userX = coordinate[0];
          int userY = coordinate[1];
          Square shootSquare = player.getBoard().getOcean()[userX][userY];
          if (shootSquare.getSquare() == SquareType.SHIP){
               for(Ship ship : ships){
                    if(ship.shipSquares.contains(shootSquare)) ship.isSunk();
               }
               return true;
          }
          return false;
     }
}