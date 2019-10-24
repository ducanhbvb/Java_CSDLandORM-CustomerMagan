package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface GaneralService <E>{
    List<E> findAllHaveBusiness();
    void saveHaveBusiness(E E);
    E findByIdHaveBusiness(long id);
    void updateHaveBusiness(long id, E e);
    void removeHaveBusiness(long id);
}
