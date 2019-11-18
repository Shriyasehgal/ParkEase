package ParkEaseSheHack.api.ParkEasespringapi;


import javax.persistence.*;

@Entity
public class Slot{
@Id
private String slot_id;
private int distance;
public String getSlot_id() {
    return slot_id;
}
public void setSlot_id(String slot_id) {
    this.slot_id = slot_id;
}
Slot(){

}
Slot(String slot_id, int distance){
this.slot_id=slot_id;
this.distance=distance;
}
public int getDistance() {
    return distance;
}

public void setDistance(int distance) {
    this.distance = distance;
}

    @Override
    public String toString() {
        return "Slot{" +
                "slot_id='" + slot_id + '\'' +
                ", distance=" + distance +
                '}';
    }
}
