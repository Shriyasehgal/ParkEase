package ParkEaseSheHack.api.ParkEasespringapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerdetsRepo extends JpaRepository<Customerdets, Integer> {
 @Override
 List<Customerdets> findAll();
}
