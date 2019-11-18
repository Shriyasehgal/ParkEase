//package ParkEaseSheHack.api.ParkEasespringapi;
//
//import javax.persistence.FetchType;
//import javax.persistence.ManyToOne;
//
//public class Direction {
//    private String action;
//    //{straight, back, right, left}
//
//    private int dist;
//    private String units;
//
//    @ManyToOne(fetch= FetchType.LAZY)
//    private Slot slot;
//
//    public String getAction() {
//        return action;
//    }
//
//    public void setAction(String action) {
//        this.action = action;
//    }
//
//    public int getDist() {
//        return dist;
//    }
//
//    public void setDist(int dist) {
//        this.dist = dist;
//    }
//
//    public String getUnits() {
//        return units;
//    }
//
//    public void setUnits(String units) {
//        this.units = units;
//    }
//
//    @Override
//    public String toString() {
//        return "Direction{" +
//                "action='" + action + '\'' +
//                ", dist=" + dist +
//                ", units='" + units + '\'' +
//                '}';
//    }
//}