package ParkEaseSheHack.api.ParkEasespringapi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customerdets {

    @Id
    private int customerid;
    private String name;
    private String password;
    private String carnos;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name ;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCarnos() {
        return carnos;
    }

    public void setCarnos(String carnos) {
        this.carnos = carnos;
    }

    @Override
    public String toString() {
        return "Customerdets{" +
                "customerid=" + customerid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", carnos=" + carnos +
                '}';
    }
}
