package ParkEaseSheHack.api.ParkEasespringapi;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Entity
@Transactional
public class Customer {

    @Id
    private String customerId;
    private String name;
    private String password;
    private String cars;
    Customer(){

    }
    public Customer(String customerId, String name, String password, String cars) {
        this.customerId = customerId;
        this.name = name;
        this.password = password;
        this.cars = cars;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public String getPassword() {
        return password;
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", cars=" + cars +
                '}';
    }
}
