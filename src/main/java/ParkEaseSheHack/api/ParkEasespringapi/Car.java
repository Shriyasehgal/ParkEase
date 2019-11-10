package ParkEaseSheHack.api.ParkEasespringapi;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {


@Id
String carno;
@ManyToOne(fetch= FetchType.LAZY)
Customer customer;

Car(String carno,Customer customer){
    this.carno=carno;
    this.customer=customer;
}
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carno='" + carno + '\'' +
                ", customer=" + customer +
                '}';
    }
}
