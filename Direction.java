package ParkEaseSheHack.api.ParkEasespringapi;

    public class Direction {
        private String action;
        //{straight, back, right, left}

        private int dist;
        private String units;

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public int getDist() {
            return dist;
        }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

        @Override
        public String toString() {
            return "Direction{" +
                    "action='" + action + '\'' +
                    ", dist=" + dist +
                    ", units='" + units + '\'' +
                    '}';
        }
    }

