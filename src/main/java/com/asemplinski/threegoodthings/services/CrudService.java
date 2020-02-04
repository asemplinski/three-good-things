package com.asemplinski.threegoodthings.services;

import java.util.List;


public interface CrudService<T, ID> {

    List<T> findall();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);


}
