package battleship;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HighScore {

    Display display = new Display();



    public String HighScore(){
        try {
            StringBuilder data = new StringBuilder();
            File myObj = new File("high-score.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data.append(myReader.nextLine()).append("\n");
            }
            myReader.close();
            return data.toString();
        } catch (FileNotFoundException e) {
            display.displayMsg("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}


