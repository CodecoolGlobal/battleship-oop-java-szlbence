import java.util.Scanner;

public class Input {

    public String getUserInputName(){
        String input = getUserInput();
        return getUserInput();
    }

    public String getUserInputShipDir(){
        return "";
    }


    public String getUserInput(){
        Scanner myVar = new Scanner(System.in);
        String input = myVar.nextLine();
        return input;

    }

    private String validateUserInputCoordinate(){
        return null;
    }

    private String validateUserInputShipDir(){
        return null;
    }

}
