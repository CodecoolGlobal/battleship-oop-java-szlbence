package battleship;

public enum SquareType {
        EMPTY("\uD83C\uDF0A"),
        SHIP("\uD83D\uDEF6"),
        HIT("\uD83D\uDFE8"),
        SUNK("\uD83D\uDD25"),
        MISSED("⭕");

        public final String squareDisplay;

        private SquareType(String squareDisplay){
                this.squareDisplay = squareDisplay;
        }

        @Override
        public String toString() {
                return squareDisplay;
        }
}
