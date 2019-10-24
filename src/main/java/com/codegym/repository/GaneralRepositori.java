package com.codegym.repository;

import java.util.List;

public interface GaneralRepositori<E> {
    List<E> findAll();
    //void add(E e);
    void save(E e);
    E findById(long id);
    void update(long id, E e);
    void remove(long id);
}
