package ParkEaseSheHack.api.ParkEasespringapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    public CustomerdetsRepo custRepo;

    @GetMapping("/parkease/getCustomerDetails")
    public List<Customerdets> retrieveCustomer(){

        System.out.println(custRepo.findAll()+"THIS IS RESP");
        //return 111;
        return custRepo.findAll();

    }

}
