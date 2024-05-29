package com.intro.storecoffe;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractService<T> {

    protected JpaRepository<T, Long> repository;

    public AbstractService(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    public List<T> getAll() {
        return repository.findAll();
    }

    public T getById(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("No entity with id " + id)
        );
    }

    public T add(T entity) {
        return repository.save(entity);
    }

    public abstract T update(T entity, Long id);

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
