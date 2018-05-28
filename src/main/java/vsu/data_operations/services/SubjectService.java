package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.converters.SubjectConverter;
import vsu.data_operations.dto.SubjectDTO;
import vsu.data_operations.repositories.SubjectRepository;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Transactional
    public SubjectDTO add(SubjectDTO cd){
        return SubjectConverter.Entity_To_DTO(subjectRepository.save(SubjectConverter.DTO_to_Entity(cd)));
    }
}
