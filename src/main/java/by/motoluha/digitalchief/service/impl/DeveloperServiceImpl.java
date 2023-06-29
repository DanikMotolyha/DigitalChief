package by.motoluha.digitalchief.service.impl;

import by.motoluha.digitalchief.ecxeption.DeveloperNotFoundException;
import by.motoluha.digitalchief.entity.Developer;
import by.motoluha.digitalchief.repository.DeveloperRepository;
import by.motoluha.digitalchief.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public List<Developer> getAll() {
        return developerRepository.findAll();
    }

    @Override
    public Optional<Developer> getById(Long id) {
        return developerRepository.findById(id);
    }

    @Override
    public Developer save(Developer entity) {
        return developerRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        Optional<Developer> byId = developerRepository.findById(id);
        if(byId.isPresent()){
            developerRepository.delete(byId.get());
        } else {
            throw new DeveloperNotFoundException("Cannot find developer by id: " + id);
        }
    }
}
