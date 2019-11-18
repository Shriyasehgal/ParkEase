package ParkEaseSheHack.api.ParkEasespringapi;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ParkingSlotRepo extends JpaRepository<Slot, String> {
    @Override
    Optional<Slot> findById(String s);

    @Override
    List<Slot> findAll();
}
