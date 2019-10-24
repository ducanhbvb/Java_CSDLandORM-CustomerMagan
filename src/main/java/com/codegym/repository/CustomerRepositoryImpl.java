package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Transactional
public class CustomerRepositoryImpl implements CustomerRepostory{
//    @PersistenceUnit
//    EntityManagerFactory emf;
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = em.createNamedQuery("findAllCustomers").getResultList();

        return customerList;
    }



//    @Override
//    public void add(Customer customer) {
//        em.persist(customer);
//    }

    @Override
    public void save(Customer customer) {
        System.out.println(">>>> customer:"+customer);
        em.persist(customer);
//        em.
    }

    @Override
    public Customer findById(long id) {
        Customer customer = em.find(Customer.class, id);


        return customer;
    }

    @Override
    public void update(long id, Customer customer) {

        em.merge(customer);
    }

    @Override
    public void remove(long id) {
        Customer customer =em.find(Customer.class,id);

        if(customer != null){

            em.remove(customer);

        }
    }
}
