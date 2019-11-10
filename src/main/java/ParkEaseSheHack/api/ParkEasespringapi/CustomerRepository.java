package ParkEaseSheHack.api.ParkEasespringapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
 @Override
 List<Customer> findAll();
}
