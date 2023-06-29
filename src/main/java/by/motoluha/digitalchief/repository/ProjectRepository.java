package by.motoluha.digitalchief.repository;

import by.motoluha.digitalchief.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@link Project}
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
