package board;

public enum SquareType {
        EMPTY("≋"),
        SHIP("⚓"),
        HIT("✔"),
        SUNK("\uD83D\uDD25"),
        MISSED("✖");

        public final String squareDisplay;

        private SquareType(String squareDisplay){
                this.squareDisplay = squareDisplay;
        }
}
