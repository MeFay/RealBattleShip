public class Ship {
        String name;
        int size;

        public Ship(String name, int size) {
            this.name = name;
            this.size = size;
        }

    public Ship[] addShipTypes() {
        Ship[] defaultShips = new Ship[5];
        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 0:
                    Ship carrier = new Ship("AircraftCarrier", 5);
                    defaultShips[i] = carrier;
                    break;
                case 1:
                    Ship battleship = new Ship("Battleship", 4);
                    defaultShips[i] = battleship;
                    break;
                case 2:
                    Ship cruiser = new Ship("Cruiser", 3);
                    defaultShips[i] = cruiser;
                    break;
                case 3:
                    Ship sub = new Ship("Submarine", 3);
                    defaultShips[i] = sub;
                    break;
                case 4:
                    Ship destroyer = new Ship("Destroyer", 2);
                    defaultShips[i] = destroyer;
                    break;
            }
        }
        return defaultShips;
    }
}
