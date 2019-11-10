package ParkEaseSheHack.api.ParkEasespringapi;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingSlotRepo extends JpaRepository<ParkingSlot, Integer> {

    ParkingSlot findById(int slotid);

    List<ParkingSlot> findAll();
}
