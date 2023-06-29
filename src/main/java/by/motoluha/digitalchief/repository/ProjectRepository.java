package by.motoluha.digitalchief.repository;

import by.motoluha.digitalchief.entity.Project;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;


/**
 * Repository for {@link Project}
 */
public interface ProjectRepository extends CrudRepository<Project, BigInteger> {
}
