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

    @OneToMany
    private List<Car> cars;
    Customer(){

    }
    public Customer(String customerId, String name, String password, List<Car> cars) {
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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public boolean isCarExists(String carno){
        for(Car car:cars){
            if(car.getCarno().toLowerCase().equals(carno.toLowerCase())){
                return true;
            }
        }
        return false;
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
