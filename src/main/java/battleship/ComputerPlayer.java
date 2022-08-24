package battleship;

public class ComputerPlayer extends Player{

    // takes random shots excluding already struck fields

    // check what needs overriding
    //      - shootEnemy
    //      -

    public void shootEnemy(Square[][] ocean, Ship ship){
        int[] robotCoordinates = Util.generateRandomCoordinates();
        int robotX = robotCoordinates[0];
        int robotY = robotCoordinates[1];
        if (isHit(robotCoordinates, ship)){
            ocean[robotX][robotY].setSquare(SquareType.HIT);
        } else {
            ocean[robotX][robotY].setSquare(SquareType.MISSED);
        }

    }



}
