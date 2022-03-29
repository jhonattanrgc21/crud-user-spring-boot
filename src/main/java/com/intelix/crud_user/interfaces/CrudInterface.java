package com.intelix.crud_user.interfaces;

import java.util.List;
import java.util.Optional;

public interface CrudInterface<T> {
    T create(T entity);

    T update(long id, T entity);

    List<T> getAll();

    Optional<T> getById(long id);

    Optional<T> getByName(String name);

    void delete(long id);
}
