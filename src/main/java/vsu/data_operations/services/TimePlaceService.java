package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.converters.TimePlaceConverter;
import vsu.data_operations.dto.TimePlaceDTO;
import vsu.data_operations.repositories.TimePlaceRepository;

@Service
public class TimePlaceService {
    private final TimePlaceRepository timePlaceRepository;

    public TimePlaceService(TimePlaceRepository timePlaceRepository) {
        this.timePlaceRepository = timePlaceRepository;
    }


    @Transactional
    public TimePlaceDTO add(TimePlaceDTO cd){
        return TimePlaceConverter.Entity_To_DTO(timePlaceRepository.save(TimePlaceConverter.DTO_to_Entity(cd)));
    }
}
