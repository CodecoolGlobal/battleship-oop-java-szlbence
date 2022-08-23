public enum ShipType {
        CARRIER(1),
        CRUISER(3),
        BATTLESHIP(4),
        SUBMARINE(5),
        DESTROYER(7);

        public final int shipDisplay;

        ShipType(int shipDisplay) {this.shipDisplay = shipDisplay;}
}
