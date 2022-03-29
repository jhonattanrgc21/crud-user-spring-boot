package com.intelix.crud_user.interfaces;

import java.util.List;
import java.util.Optional;

public interface CrudInterface<T> {
    T create(T entity);

    T update(long id, T entity);

    List<T> getAll();

    T getById(long id);

    void delete(long id);
}
