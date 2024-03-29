package battleship;

import java.util.ArrayList;

public class Player {
     private Board board = new Board();
     // Square [][] ocean = board.getOcean();

     String name;
     Display display = new Display();

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

     private void setIsAlive(){
          int count = 0;
          for(Ship ship: ships){
              for(Square square : ship.shipSquares){
                   if(square.getSquare() == SquareType.SHIP)  count++ ;
              }
         }
          if(count == 0) this.isalive = false;
     }

     public void shootEnemy(Player player, int[] coordinate){
          var ocean = player.getBoard().getOcean();
          if (isHit(player, coordinate)){
               player.getBoard().setOcean(SquareType.HIT, coordinate);
          } else if (ocean[coordinate[0]][coordinate[1]].getSquare() == SquareType.EMPTY) {
               player.getBoard().setOcean(SquareType.MISSED, coordinate);
          }
          else{
               display.displayMsg("You already shot there, too bad.");
          }
     }

     public boolean isHit(Player player, int[] coordinate){
          int userX = coordinate[0];
          int userY = coordinate[1];
          Square shootSquare = player.getBoard().getOcean()[userX][userY];
          if (shootSquare.getSquare() == SquareType.SHIP){
               for(Ship ship : ships){
                    var test = ship.shipSquares;
                    for (int i = 0; i < test.size(); i++) {
                         if (test.get(i).getSquare().equals(shootSquare.getSquare())){
                              ship.isSunk(test);}
                    }
               }
               return true;
          }
          return false;
     }

     public boolean isAlive() {
          setIsAlive();
          return this.isalive;
     }
}