package battleship;

import java.util.ArrayList;

public class Player {
    ArrayList<Ship> ships = new ArrayList<Ship>();
    private boolean alive = true;

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}