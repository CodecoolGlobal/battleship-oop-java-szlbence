package battleship;


import java.util.Random;

public class Util {

    static Random random = new Random();

    public static int[] generateRandomCoordinate(){
        int xCoordinate = random.nextInt(10) + 1;
        int yCoordinate = random.nextInt(10) + 1;
        return new int[]{xCoordinate, yCoordinate};
    }

    public static String generateDirection(){
        String directions[] = new String[] {
                "up", "down", "left", "right"};
        int r = random.nextInt(4);
        return directions[r];
    }
}
