package ParkEaseSheHack.api.ParkEasespringapi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.transaction.Transactional;

@Entity
@Transactional
public class Customer {

    @Id
    private String customerId;
    private String name;
    private String password;
    private String car;
    Customer(){

    }
    public Customer(String customerId, String name, String password, String car) {
        this.customerId = customerId;
        this.name = name;
        this.password = password;
        this.car = car;
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
        return car;
    }

    public void setCars(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", cars=" + car +
                '}';
    }
}
