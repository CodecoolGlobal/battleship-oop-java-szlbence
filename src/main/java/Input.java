import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Input {

    private Map<String, Integer> xCoordinate = new HashMap<String, Integer>() {{
        put("A", 0);
        put("B", 1);
        put("C", 2);
        put("D", 3);
        put("E", 4);
        put("F", 5);
        put("G", 6);
        put("H", 7);
        put("I", 8);
        put("J", 9);
    }};

    private Map<String, Integer> yCoordinate = new HashMap<String, Integer>() {{
        put("1", 0);
        put("2", 1);
        put("3", 2);
        put("4", 3);
        put("5", 4);
        put("6", 5);
        put("7", 6);
        put("8", 7);
        put("9", 8);
        put("10", 9);
    }};

    public String getUserInputName() {
        return getUserInput();
    }

    public String getUserInputShipDir() {
        boolean validInput = false;
        String input = "";
        while (!validInput) {
            input = getUserInput();
            validInput = validateUserInputShipDir(input);
        }
        return input;
    }

    public int[] getUserInputCoord() {
        boolean validInput = false;
        int[] coord = new int[2];
        String input = "";
        while (!validInput) {
            input = getUserInput();
            validInput = validateUserInputCoordinate(input);
        }
        int xCoord = xCoordinate.get(input.substring(0, 1).toUpperCase());
        int yCoord = yCoordinate.get(input.substring(1).toUpperCase());
        coord[0] = xCoord;
        coord[1] = yCoord;
        return coord;
    }

    public int getUserInputMainMenu() {
        boolean validInput = false;
        String input = "";
        while (!validInput) {
            input = getUserInput();
            validInput = validateUserInputMainMenu(input);
        }
        int menuChoice = Integer. parseInt(input);
        return menuChoice;
    }

    public String getUserInput() {
        Scanner myVar = new Scanner(System.in);
        String input = myVar.nextLine();
        return input;

    }



    private boolean validateUserInputCoordinate(String input) {
        String xCoord = input.substring(0, 1).toUpperCase();
        String yCoord = input.substring(1);
        return xCoordinate.containsKey(xCoord) && yCoordinate.containsKey(yCoord);
    }

    private boolean validateUserInputShipDir(String input) {
        return (input.equals("up") || input.equals("down") || input.equals("right") || input.equals("left"));
    }

    private boolean validateUserInputMainMenu(String input) {
        return input.equals("1");
    }

}
