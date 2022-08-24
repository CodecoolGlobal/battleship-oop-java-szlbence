public class Display {

    public void displayOcean(Square [][] ocean ){
        System.out.print("  ");
        for (int i = 0; i < ocean[0].length; i++) {
            System.out.print(i + 1 + " ");
        }
        // System.out.print("  1 2 3 4 5 6 7 8 9 10 11");
        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N"};
        for (int row = 0; row < ocean.length; row++) {
            System.out.print("\n");
            System.out.print(letters[row].toUpperCase() + " ");
            for (int col = 0; col < ocean[0].length; col++) {
                String marker = ocean[row][col].getSquare().toString();

                System.out.print(marker);
            }
        }
        System.out.println();
        System.out.println();
    }

    public void displayPlacement(){
    }

   public void displayMenu(){

   }

   public void displayResults(){

   }

    public void displayMsg(String message){
        System.out.println(message);
    }

}
