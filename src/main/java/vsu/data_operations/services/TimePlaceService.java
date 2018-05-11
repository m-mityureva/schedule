package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import vsu.data_operations.repositories.TimePlaceRepository;

@Service
public class TimePlaceService {
    private final TimePlaceRepository timePlaceRepository;

    public TimePlaceService(TimePlaceRepository timePlaceRepository) {
        this.timePlaceRepository = timePlaceRepository;
    }
}
