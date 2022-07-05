package br.com.api.parkingcontrol.services;

import br.com.api.parkingcontrol.models.ParkingSpotModel;
import br.com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {
    @Autowired
    ParkingSpotRepository parkingSpotRepository;

    @Transactional
    public Object save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
}
