package by.motoluha.digitalchief.repository;

import by.motoluha.digitalchief.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@link Developer}
 */
@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}
