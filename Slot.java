package ParkEaseSheHack.api.ParkEasespringapi;

public class Slot {
    int slot_id;
    int customer_id=0;
    boolean isbooked=false;
    int distance;
    static int slots=0;
    /**
     * @return the slot_id
     */
    public int getSlot_id() {
        return slot_id;
    }

    /**
     * @param slot_id the slot_id to set
     */
    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    Slot(int slot_id, int distance){
        this.slot_id=slot_id;
        this.distance=distance;
        slots++;
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }
    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

}
