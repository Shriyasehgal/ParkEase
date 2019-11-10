package ParkEaseSheHack.api.ParkEasespringapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ParkingSlot {

    //Customerdets customer = new Customerdets();

    @Id
    @GeneratedValue
    private String slotid;
    private Customer customer;
    private boolean isBooked;
    private List<Direction> directions;


    public String getSlotid() {
        return slotid;
    }

    public void setSlotid(String slotid) {
        this.slotid = slotid;
    }

    public List<Direction> getDirections() {
        return directions;
    }

    public void setDirections(List<Direction> directions) {
        this.directions = directions;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

   /* public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }*/

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "slotid='" + slotid + '\'' +
                ", customer=" + customer +
                ", isBooked=" + isBooked +
                ", directions=" + directions +
                '}';
    }
}
