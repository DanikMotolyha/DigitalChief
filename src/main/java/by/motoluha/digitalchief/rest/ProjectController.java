package by.motoluha.digitalchief.rest;

import by.motoluha.digitalchief.ecxeption.ProjectNotFountException;
import by.motoluha.digitalchief.entity.Project;
import by.motoluha.digitalchief.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("project/")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    List<Project> getAll() {
        return projectService.getAll();
    }

    @GetMapping("/{id}")
    Project getById(@PathVariable Long id) {
        return projectService.getById(id)
                .orElseThrow(() -> new ProjectNotFountException(String.valueOf(id)));
    }

    @PostMapping("/")
    Project save(@RequestBody Project project) {
        return projectService.save(project);
    }


    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
        projectService.delete(id);
    }

}
