package by.motoluha.digitalchief.repository;

import by.motoluha.digitalchief.entity.Developer;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

/**
 * Repository for {@link Developer}
 */
public interface DeveloperRepository extends CrudRepository<Developer, BigInteger> {
}
