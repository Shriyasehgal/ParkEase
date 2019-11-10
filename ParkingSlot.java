package ParkEaseSheHack.api.ParkEasespringapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ParkingSlot {

    //Customerdets customer = new Customerdets();

    @Id
    @GeneratedValue
    private int slotid;
    private Customer customer;
    private boolean isBooked;
    private int distance;
   // private List<Direction> directions;

    public int getSlotid() {
        return slotid;
    }



    public void setSlotid(int slotid) {
        this.slotid = slotid;
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
                "slotid=" + slotid +
                ", customer=" + customer +
                ", isBooked=" + isBooked +
               // ", distance=" + distance +
                '}';
    }
}
