package ParkEaseSheHack.api.ParkEasespringapi;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ParkingLot {

    @Id
    int Lotid;
    List<Integer> noOfSlots;
    int Lat;
    int Long;
    List<Direction> direct;

    public int getLotid() {
        return Lotid;
    }

    public void setLotid(int lotid) {
        Lotid = lotid;
    }

    public List<Integer> getNoOfSlots() {
        return noOfSlots;
    }

    public void setNoOfSlots(List<Integer> noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

    public int getLat() {
        return Lat;
    }

    public void setLat(int lat) {
        Lat = lat;
    }

    public int getLong() {
        return Long;
    }

    public void setLong(int aLong) {
        Long = aLong;
    }

    public List<Direction> getDirect() {
        return direct;
    }

    public void setDirect(List<Direction> direct) {
        this.direct = direct;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "Lotid=" + Lotid +
                ", noOfSlots=" + noOfSlots +
                ", Lat=" + Lat +
                ", Long=" + Long +
                ", direct=" + direct +
                '}';
    }
}


