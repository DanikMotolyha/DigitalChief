package by.motoluha.digitalchief.service.impl;

import by.motoluha.digitalchief.ecxeption.ProjectNotFountException;
import by.motoluha.digitalchief.entity.Project;
import by.motoluha.digitalchief.repository.ProjectRepository;
import by.motoluha.digitalchief.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAll() {
        return projectRepository.findAll();
    }

    @Override
    public Optional<Project> getById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project entity) {
        return projectRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        Optional<Project> byId = projectRepository.findById(id);
        if (byId.isPresent()) {
            projectRepository.delete(byId.get());
        } else {
            throw new ProjectNotFountException("Cannot find project by id: " + id);
        }
    }
}
