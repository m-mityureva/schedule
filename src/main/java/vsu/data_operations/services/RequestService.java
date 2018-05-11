package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import vsu.data_operations.repositories.RequestRepository;

@Service
public class RequestService {
    private final RequestRepository requestRepository;


    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }
}
