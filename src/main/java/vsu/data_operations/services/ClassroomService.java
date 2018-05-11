package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import vsu.data_operations.repositories.ClassroomRepository;

@Service
public class ClassroomService {
    private final ClassroomRepository classroomRepository;

    public ClassroomService(ClassroomRepository classroomRepository){
        this.classroomRepository = classroomRepository;
    }
}
