package com.codeclan.example.restaurantBooking.repositories;

import com.codeclan.example.restaurantBooking.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersById(Long id){
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.add(Restrictions.eq("id", id));

            result = cr.list();

        }
        catch ( HibernateException ex ){
            ex.printStackTrace();
        }
        return result;
    }

}
