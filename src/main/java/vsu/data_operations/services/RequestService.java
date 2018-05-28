package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.converters.RequestConverter;
import vsu.data_operations.dto.RequestDTO;
import vsu.data_operations.repositories.RequestRepository;

@Service
public class RequestService {
    private final RequestRepository requestRepository;


    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Transactional
    public RequestDTO add(RequestDTO cd){
        return RequestConverter.Entity_to_DTO(requestRepository.save(RequestConverter.DTO_to_Entity(cd)));
    }
}
