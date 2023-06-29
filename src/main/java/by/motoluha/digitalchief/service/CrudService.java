package by.motoluha.digitalchief.service;

import java.util.List;
import java.util.Optional;

/**
 * Base interface for CRUD operation.
 *
 * @param <T> CRUD entity
 */
public interface CrudService<T> {

    /**
     * select all entities from db.
     *
     * @return finding list of T
     */
    List<T> getAll();

    /**
     * select by entity id.
     *
     * @param id selected id
     * @return finding object T
     */
    Optional<T> getById(Long id);

    /**
     * Save new entity, otherwise edit old.
     *
     * @param entity object for save/edit
     * @return result object T
     */
    T save(T entity);
}
