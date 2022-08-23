import java.util.Scanner;

public class Input {

    public String getUserInputName(){
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


    public String getUserInput(){
        Scanner myVar = new Scanner(System.in);
        String input = myVar.nextLine();
        return input;

    }

    private String validateUserInputCoordinate(){
        return null;
    }

    private boolean validateUserInputShipDir(String input){
        return (input.equals("up") || input.equals("down") || input.equals("right") || input.equals("left"));
    }

}
