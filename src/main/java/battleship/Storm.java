package battleship;

public class Storm {

    public static final int CHANCE_OF_STORM = 30;
    private boolean isStorm;

    public boolean isStorm(){
        return CHANCE_OF_STORM >= Util.generateRandomInteger();
    }

    public int [] stormCoordinatesGenerator() {
        return Util.generateRandomCoordinate();
    }
}
