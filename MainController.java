package ParkEaseSheHack.api.ParkEasespringapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.List;

@RestController
public class MainController {

    HashMap<Integer,Slot> minHeap =new HashMap<>();
    @Autowired
    public CustomerRepository customerRepository;

    @Autowired
     public ParkingSlotRepo parkslotrepo;

     //= parkslotrepo.findAll();


    HashMap<Integer,Slot> allotedSlots=new HashMap<>();



    @GetMapping("/parkease/getCustomerDetails")
    public List<Customer> retrieveCustomer(){
        System.out.println(customerRepository.findAll()+"THIS IS RESP");
        return customerRepository.findAll();
    }
    @PostMapping("/parkease/registerCustomer")
    public ResponseEntity<Object> addCustomer(@RequestBody Customer customer){
        try {
            Customer savedCustomer=customerRepository.save(customer);
            URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("")
                    .buildAndExpand(savedCustomer.getCustomerId()).toUri();
            return ResponseEntity.created(location).build();
        }catch (Exception exception){
            return ResponseEntity.unprocessableEntity().build();
        }
    }
    @PostMapping("/parkease/login")
    public ResponseEntity<Object> loginCustomer(@RequestBody Customer customer){
        if (customerRepository.findById(customer.getCustomerId()).get().getPassword().equals(customer.getPassword())){
            return ResponseEntity.accepted().build();
        }else {
            return ResponseEntity.badRequest().build();
        }
    }
   /* @Modifying(clearAutomatically = true)
    @PostMapping("/parkease/add_car")
    public ResponseEntity<Object> loginCustomer(@Param("customer_id") String customer_id, @Param("car_no") String car_no){
        System.out.println("I am here");
        if(!customerRepository.existsById(customer_id)){
            return ResponseEntity.badRequest().build();
        }

        Customer customer=customerRepository.findById(customer_id).get();
         if(customer==null){
            return ResponseEntity.badRequest().build();
        }
        if(!customer.isCarExists(car_no)) {
            Car car=new Car(car_no,customer);
            customer.getCars().add(car);
            Customer newCustomer=new Customer(customer.getCustomerId(),customer.getName(),customer.getPassword(),customer.getCars());
            customerRepository.delete(customer);
            Customer savedCustomer=customerRepository.save(newCustomer);

            return ResponseEntity.accepted().build();
        }else {
            return ResponseEntity.unprocessableEntity().build();
        }
    }*/
}
