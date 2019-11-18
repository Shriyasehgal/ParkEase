package ParkEaseSheHack.api.ParkEasespringapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.PostConstruct;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    public CustomerRepository customerRepository;
    @Autowired
    public ParkingSlotRepo parkingSlotRepo;
    HashMap<String,Slot> allotedSlots=new HashMap<>();
    MinHeapUsingArray minHeapUsingArray;

    @PostConstruct
    public void createHeap() {
        List<Slot> slotsList=parkingSlotRepo.findAll();
        int size=slotsList.size();
        minHeapUsingArray=new MinHeapUsingArray(size);

        Slot[] slots=new Slot[slotsList.size()];
        int count=0;
        for (Slot slot:slotsList){
            slots[count]=slot;
            count++;
        }
        for(int i=0;i<size;i++){
            try{
                minHeapUsingArray.insert(slots[i]);
            }catch(Exception exception){

            }
        }
        System.out.println("");
    }
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
    @GetMapping("/parkease/available_slot")
    public String available_slot(){
        try {
            return minHeapUsingArray.getRoot().getSlot_id();
        }catch (Exception exception){
            return "";

        }
    }
    @PostMapping("/parkease/book_slot")
    public Slot bookSlot(@Param("slotId") String slotId){
        try {
            Slot slot=minHeapUsingArray.delete();
        }catch (Exception exception){

        }
        allotedSlots.put(slotId,parkingSlotRepo.findById(slotId).get() );
        return allotedSlots.get(slotId);
    }
    @PostMapping("/parkease/unallocate_slot")
    public boolean unallocateSlot(@Param("slotId") String slotId){
        try {
            Slot slot=allotedSlots.get(slotId);
            minHeapUsingArray.insert(slot);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

}
