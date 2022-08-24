public class Display {

    public static void displayOcean(Square[][] enemyOcean ){
        System.out.print("  ");
        for (int i = 0; i < enemyOcean[0].length; i++) {
            System.out.print(i + 1 + " ");
        }
        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N"};
        for (int row = 0; row < enemyOcean.length; row++) {
            System.out.print("\n");
            System.out.print(letters[row].toUpperCase() + " ");
            for (int col = 0; col < enemyOcean[0].length; col++) {
                String marker;
                if (enemyOcean[row][col].getSquare() == SquareType.SHIP){
                    marker = SquareType.EMPTY.toString();
                } else marker = enemyOcean[row][col].getSquare().toString();
                System.out.print(marker + " ");
            }
        }
        System.out.println("\n\n");
    }

    public void displayPlacement(Square[][] ownOcean){
        System.out.print("  ");
        for (int i = 0; i < ownOcean[0].length; i++) {
            System.out.print(i + 1 + " ");
        }
        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N"};
        for (int row = 0; row < ownOcean.length; row++) {
            System.out.print("\n");
            System.out.print(letters[row].toUpperCase() + " ");
            for (int col = 0; col < ownOcean[0].length; col++) {
                String marker = ownOcean[row][col].getSquare().toString();
                System.out.print(marker + " ");
            }
        }
        System.out.println("\n\n");
    }

   public void displayMenu(){

   }

   public void displayResults(){

   }

    public void displayMsg(String message){
        System.out.println(message);
    }

    public void clearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

}
