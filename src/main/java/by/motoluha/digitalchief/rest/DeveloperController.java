package by.motoluha.digitalchief.rest;

import by.motoluha.digitalchief.ecxeption.DeveloperNotFoundException;
import by.motoluha.digitalchief.entity.Developer;
import by.motoluha.digitalchief.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("developer/")
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;

    @GetMapping("/")
    List<Developer> getAll() {
        return developerService.getAll();
    }

    @GetMapping("/{id}")
    Developer getById(@PathVariable Long id) {
        return developerService.getById(id)
                .orElseThrow(() -> new DeveloperNotFoundException(String.valueOf(id)));
    }

    @PostMapping("/")
    Developer save(@RequestBody Developer developer) {
        return developerService.save(developer);
    }

}
