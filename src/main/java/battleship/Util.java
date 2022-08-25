package battleship;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Util {


    Display display = new Display();
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

    public static int generateRandomInteger(){
        int randomInteger = random.nextInt(100) + 1;
        return randomInteger;
    }



    public void writeToFile (String nameAndScore) {
        try {
            FileWriter myWriter = new FileWriter("high-score.txt");
            myWriter.write(nameAndScore);
            myWriter.close();
            display.displayMsg("Score saved");
        } catch (IOException e) {
            display.displayMsg("An error occurred.");
            e.printStackTrace();
        }
    }
}
