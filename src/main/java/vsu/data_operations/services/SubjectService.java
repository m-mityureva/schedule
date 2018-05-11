package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import vsu.data_operations.repositories.SubjectRepository;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }
}
