package services;

import entities.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.ClassRepository;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public Iterable<Class> getAllClasses(){
        return classRepository.findAll();
    }
}
