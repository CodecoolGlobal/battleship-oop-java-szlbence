package battleship;

public class ComputerPlayer extends Player{

    public ComputerPlayer(){
        super("Robot");
    }

    public void shootEnemy(Square[][] ocean, Ship ship, Player player){
        int[] robotCoordinates = Util.generateRandomCoordinate();
        int robotX = robotCoordinates[0];
        int robotY = robotCoordinates[1];
        if (isHit(player, robotCoordinates)){
            ocean[robotX][robotY].setSquare(SquareType.HIT);
        } else {
            ocean[robotX][robotY].setSquare(SquareType.MISSED);
        }

    }



}
